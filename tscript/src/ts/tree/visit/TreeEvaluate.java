
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
		environment.declareVariable(TSString.create("undefined"), false); // add undefined to the lexical environment 
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
		else if (binaryOperator.getOp() == Binop.MULTIPLY)
		{
			left.setValue(left.getValue().multiply(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.ASSIGN)
		{
			left.setValue(left.getValue().simpleAssignment(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.EQUAL)
		{
			//TODO: left.setValue(left.getValue().simpleAssignment(right.getValue()));
			left.setValue(left.getValue().equal(right.getValue()));
		}
		else
		{
			assert false : "unexpected binary operator";
		}
		return left;
	}

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
			//TODO: Check if this is correct, I am guessing here. 
			if(child.getValue().toBoolean() == TSBoolean.booleanTrue)
				child.setValue(TSBoolean.booleanFalse);
			else 
				child.setValue(TSBoolean.booleanTrue);
		} 
		else if (unaryOperator.getOp() == Unary.UNARY_MINUS)
		{
			//TODO: Implement Unary Minus 
		}
		else
		{
			assert false : "unexpected unary operator";
		}
		return child;
	}


	public TSCompletion visit(final ExpressionStatement expressionStatement)
	{
		TSCompletion completion = visitNode(expressionStatement.getExp());
		return completion;
	}

	public TSCompletion visit(final Identifier identifier)
	{
		return TSCompletion.createNormal(environment.getIdentifierReference(
				TSString.create(identifier.getName())));
	}

	public TSCompletion visit(final NumericLiteral numericLiteral)
	{
		return TSCompletion.createNormal(TSNumber.create(
				numericLiteral.getValue()));
	}

	public TSCompletion visit(final BooleanLiteral booleanLiteral)
	{
		return TSCompletion.createNormal(TSBoolean.create(
				booleanLiteral.getValue()));
	}
	
	public TSCompletion visit(final NullLiteral nullLiteral)
	{
		return TSCompletion.createNormal(TSNull.value); // TODO: CHECK WITH PROFESSOR
	}

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

	public TSCompletion visit(final VarStatement varStatement)
	{
		// do not make it a configurable binding so it is not deletable
		environment.declareVariable(TSString.create(varStatement.getName()), false);
		return TSCompletion.createNormalNull();
	}

}

