
package ts.tree.visit;

import ts.Message;
import ts.tree.*;
import ts.support.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Evaluate an AST. Parameterized by the "completion" type.
 * <p>
 * The "visit" method is overloaded for every tree node type.
 *
 */
public final class TreeEvaluate extends TreeVisitorBase<TSCompletion>
{
	// this is a declarative environment for now
	// TODO: change to an environment for the global object
	private TSLexicalEnvironment environment;

	public TreeEvaluate()
	{
		environment = TSLexicalEnvironment.newDeclarativeEnvironment(null);
		// add undefined to the lexical environment
		environment.declareVariable(TSString.create("undefined"), false);  
	}

	// visit a list of ASTs and evaluate them in order
	// use wildcard for generality: list of Statements, list of Expressions, etc
	// an array must be returned but this will always return an array of size 1
	public List<TSCompletion> visitEach(final Iterable<?> nodes)
	{
		List<TSCompletion> ret = new ArrayList<TSCompletion>();

		for (final Object node : nodes)
		{
			TSCompletion completion = visitNode((Tree) node);
			if (!completion.isNormal())
			{
				ret.add(completion);
				return ret;
			} 
		}
		ret.add(TSCompletion.createNormalNull());
		return ret;
	}

	/** Visit the binary operator ASTs and evaluate 
	 *  @param binaryOperator  the binary operator AST
	 */
	public TSCompletion visit(final BinaryOperator binaryOperator)
	{
		TSCompletion left = visitNode(binaryOperator.getLeft());
		if (!left.isNormal())
		{
			return left;
		} 
		TSCompletion right = visitNode(binaryOperator.getRight());
		if (!right.isNormal())
		{
			return right;
		} 
		Message.setLocation(binaryOperator.getLoc());
		if (binaryOperator.getOp() == Binop.ADD)
		{
			left.setValue(left.getValue().add(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.SUBTRACT)
		{
			left.setValue(left.getValue().subtract(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.MULTIPLY)
		{
			left.setValue(left.getValue().multiply(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.DIVIDE)
		{
			left.setValue(left.getValue().divide(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.ASSIGN)
		{
			left.setValue(left.getValue().simpleAssignment(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.EQUAL)
		{
			left.setValue(left.getValue().equalsOperator(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.GREATER)
		{
			left.setValue(left.getValue().greaterThanOperator(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.LESS)
		{
			left.setValue(left.getValue().lessThanOperator(right.getValue()));
		}
		else
		{
			System.err.println("INVALID BINARY OPERATOR: " + binaryOperator.getOpString());
			//assert false : "unexpected binary operator";
		}
		return left;
	}

	/** Visit the unary operator ASTs and evaluate 
	 *  @param unaryOperator  the unary operator AST
	 */
	public TSCompletion visit(final UnaryOperator unaryOperator)
	{
		TSCompletion child = visitNode(unaryOperator.getChild());
		if (!child.isNormal())
		{
			return child;
		} 
		Message.setLocation(unaryOperator.getLoc());
		if (unaryOperator.getOp() == Unary.LOGICAL_NOT)
		{
			if(child.getValue().toBoolean() == TSBoolean.booleanTrue)
				child.setValue(TSBoolean.booleanFalse);
			else 
				child.setValue(TSBoolean.booleanTrue);
		} 
		else if (unaryOperator.getOp() == Unary.UNARY_MINUS)
		{
			//get the value, call toNumber, and inverse the sign
			child.setValue(TSNumber.create(-(child.getValue().toNumber().getInternal())));
		}
		else
		{
			System.err.println("INVALID UNARY OPERATOR: " + unaryOperator.getOpString());
			//assert false : "unexpected unary operator";
		}
		return child;
	}

	/** Visit the ExpressionStatement ASTs and evaluate 
	 *  @param expressionStatement  the ExpressionStatement to evaluate
	 */
	public TSCompletion visit(final ExpressionStatement expressionStatement)
	{
		TSCompletion completion = visitNode(expressionStatement.getExp());
		return completion;
	}

	/** Visit the Identifier ASTs and evaluate 
	 *  @param identifier  the Identifier to evaluate
	 */
	public TSCompletion visit(final Identifier identifier)
	{
		return TSCompletion.createNormal(environment.getIdentifierReference(
				TSString.create(identifier.getName())));
	}

	/** Visit the NumericLiteral ASTs and evaluate 
	 *  @param numericLiteral  the NumericLiteral to evaluate
	 */
	public TSCompletion visit(final NumericLiteral numericLiteral)
	{
		return TSCompletion.createNormal(TSNumber.create(
				numericLiteral.getValue()));
	}

	/** Visit the BooleanLiteral ASTs and evaluate 
	 *  @param booleanLiteral  the BooleanLiteral to evaluate
	 */
	public TSCompletion visit(final BooleanLiteral booleanLiteral)
	{
		return TSCompletion.createNormal(TSBoolean.create(
				booleanLiteral.getValue()));
	}
	
	/** Visit the StringLiteral ASTs and evaluate 
	 *  @param stringLiteral  the StringLiteral to evaluate
	 */
	public TSCompletion visit(final StringLiteral stringLiteral)
	{
		return TSCompletion.createNormal(TSString.create(
				stringLiteral.getValue()));
	}
	
	/** Visit the VariableDeclarationList ASTs and evaluate 
	 *  @param stringLiteral  the StringLiteral to evaluate
	 */
	public TSCompletion visit(final VariableDeclarationList variableDeclarationList)
	{
		visitEach((Iterable<IdentifierInitializerTuple>)variableDeclarationList.getTuples());
		return TSCompletion.createNormalNull();
	}
	
	/** Visit the IdentifierInitializerTuple ASTs and evaluate 
	 *  @param identifierInitializerTuple  the IdentifierInitializerTuple to evaluate
	 */
	public TSCompletion visit(final IdentifierInitializerTuple identifierInitializerTuple)
	{
		//declare the varable
		environment.declareVariable(TSString.create(identifierInitializerTuple.getIdentifier().getName()), false);
		//check if the right hand expression is null, if so, no need to evaluation 
		if (identifierInitializerTuple.getExpression() == null)
		{
			//same completion type as in visit(Identifier) 
			return TSCompletion.createNormal(environment.getIdentifierReference(
					TSString.create(identifierInitializerTuple.getIdentifier().getName())));
		}
		else
		{
			// value to Expression node
			TSCompletion eCompletion = visitNode(identifierInitializerTuple.getExpression());
			// value of Identifier node
			TSCompletion iCompletion = visitNode(identifierInitializerTuple.getIdentifier());
			// return TSCompletion with the identifier equal to the right hand expression 
			return TSCompletion.createNormal(iCompletion.getValue().simpleAssignment(eCompletion.getValue()));
		}
	}
	
	/** Visit the NullLiteral ASTs and evaluate 
	 *  @param nullLiteral  the NullLiteral to evaluate
	 */
	public TSCompletion visit(final NullLiteral nullLiteral)
	{
		return TSCompletion.createNormal(TSNull.value); // TODO: CHECK WITH PROFESSOR
	}

	/** Visit the PrintStatement ASTs and evaluate 
	 *  @param printStatement  the PrintStatement to evaluate
	 */
	public TSCompletion visit(final PrintStatement printStatement)
	{
		TSCompletion result = visitNode(printStatement.getExp());
		if (!result.isNormal())
		{
			return result;
		} 
		System.out.println(result.getValue().toStr().getInternal());
		return TSCompletion.createNormalNull();
	}

	/** Visit the VarStatement ASTs and evaluate 
	 *  @param varStatement  the VarStatement to evaluate
	 */
	public TSCompletion visit(final VarStatement varStatement)
	{
		// do not make it a configurable binding so it is not deletable
		environment.declareVariable(TSString.create(varStatement.getName()), false);
		return TSCompletion.createNormalNull();
	}

}

