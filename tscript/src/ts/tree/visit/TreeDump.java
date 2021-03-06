
package ts.tree.visit;

import ts.tree.*;

import java.io.PrintWriter;
import java.util.List;

/**
 * Dump an AST to a stream. Uses prefix order with indentation.
 * <p>
 * Using Object for the type parameter but there is really no return type.
 * <p>
 * The "visit" method is overloaded for each tree node type.
 */
public final class TreeDump extends TreeVisitorBase<Object>
{
	// where to write the dump to
	private PrintWriter writer;

	// current indentation amount
	private int indentation;

	// how much to increment the indentation by at each level
	// using an increment of zero would mean no indentation
	private int increment;

	// by default start even to the left margin and increment indentation
	// by 2 spaces
	public TreeDump(final PrintWriter writer)
	{
		this(writer, 0, 2);
	}

	public TreeDump(final PrintWriter writer, final int indentation,
			final int increment)
	{
		this.writer = writer;
		this.indentation = indentation;
		this.increment = increment;
	}

	// generate a string of spaces for current indentation level
	private void indent()
	{
		for (int i = 0; i < indentation; i++)
		{
			writer.print(" ");
		}
	}

	// visit a list of ASTs and dump them in order
	// use wildcard for generality: list of Statements, list of Expressions, etc
	public List<Object> visitEach(final Iterable<?> nodes)
	{
		for (final Object node : nodes)
		{
			visitNode((Tree) node);
		}
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final BinaryOperator binaryOperator)
	{
		indent();
		writer.println(binaryOperator.getOpString());
		indentation += increment;
		visitNode(binaryOperator.getLeft());
		visitNode(binaryOperator.getRight());
		indentation -= increment;
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final ExpressionStatement expressionStatement)
	{
		indent();
		writer.println("ExpressionStatement");
		indentation += increment;
		visitNode(expressionStatement.getExp());
		indentation -= increment;
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final Identifier identifier)
	{
		indent();
		writer.println("Identifier " + identifier.getName());
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final NumericLiteral numericLiteral)
	{
		indent();
		writer.println("NumericLiteral " + numericLiteral.getValue());
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final StringLiteral stringLiteral)
	{
		indent();
		writer.println("StringLiteral " + stringLiteral.getValue());
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final BooleanLiteral booleanLiteral)
	{
		indent();
		writer.println("BooleanLiteral " + booleanLiteral.getValue());
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final PrintStatement printStatement)
	{
		indent();
		writer.println("PrintStatement");
		indentation += increment;
		visitNode(printStatement.getExp());
		indentation -= increment;
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final VarStatement varStatement)
	{
		indent();
		writer.println("Var " + varStatement.getName());
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final VariableDeclarationList variableDeclarationList)
	{
		indent();
		writer.println("VariableDeclarationList");
		indentation += increment;
		visitEach((Iterable<IdentifierInitializerTuple>)variableDeclarationList.getTuples());
		indentation -= increment;
		return null;
	}

	public Object visit(final IdentifierInitializerTuple identifierInitializerTuple)
	{
		indent();
		writer.println("IdentifierInitializerTuple");
		indentation += increment;
		visitNode(identifierInitializerTuple.getIdentifier());
		// bug found in phase 1, need to check if the expression is null
		if (identifierInitializerTuple.getExpression() != null) 
		{
			visitNode(identifierInitializerTuple.getExpression()); 
		}
		indentation -= increment;
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final UnaryOperator unaryOperator)
	{
		indent();
		writer.println("Var " + unaryOperator.getOp());
		indentation += increment;
		visitNode(unaryOperator.getChild());
		indentation -= increment;
		return null;
	}

	// visit the ASTs and dump them in order
	public Object visit(final NullLiteral nullLiteral)
	{
		indent();
		writer.println("NullLiteral " + nullLiteral);
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final BlockStatement blockStatement)
	{
		indent();
		writer.println("BlockStatement");
		indentation += increment;
		visitEach((Iterable<Statement>)blockStatement.getStatements());
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final IfStatement ifStatement)
	{
		indent();
		writer.println("IfStatement");
		indentation += increment;
		visitNode(ifStatement.getIfExpression());
		visitNode(ifStatement.getIfThenStatement());
		if (ifStatement.getElseStatement() != null)
		{
			visitNode(ifStatement.getElseStatement());
		}
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final WhileStatement whileStatement)
	{
		indent();
		writer.println("WhileStatement");
		indentation += increment;
		visitNode(whileStatement.getExpression());
		visitNode(whileStatement.getStatement());
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final BreakStatement breakStatement)
	{
		indent();
		writer.println("BreakStatement");
		indentation += increment;
		if (breakStatement.getIdentifier() != null)
		{
			indent();
			writer.println("Identifier " + breakStatement.getIdentifier());
		}
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final ContinueStatement continueStatement)
	{
		indent();
		writer.println("ContinueStatement");
		indentation += increment;
		if (continueStatement.getIdentifier() != null)
		{
			indent();
			writer.println("Identifier " + continueStatement.getIdentifier());
		}
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final LabelledStatement labelledStatement)
	{
		indent();
		writer.println("LabelledStatement");
		indentation += increment;
		writer.println("Identifier " + labelledStatement.getIdentifierName());
		visitNode(labelledStatement.getStatement());
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final FunctionExpression functionExpression)
	{
		indent();
		writer.println("FunctionExpression");
		indentation += increment;
		if (functionExpression.getIdentifierName() != null)
		{
			indent();
			writer.println("Identifier " + functionExpression.getIdentifierName());

		}
		if ((functionExpression.getFunctionBody() != null) && (!functionExpression.getFunctionBody().isEmpty()))
		{
			indent();
			writer.println("FunctionBody ");
			for (SourceElement se : functionExpression.getFunctionBody()) {
				visitNode(se);
			}
		}
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final CallExpression callExpression)
	{
		indent();
		writer.println("CallExpression");
		indentation += increment;
		if (callExpression.getExpression() != null)
		{
			indent();
			writer.println("Member Expression");
			visitNode(callExpression.getExpression());
		}
		if ((callExpression.getArguments() != null) && (!callExpression.getArguments().isEmpty()))
		{
			indent();
			writer.println("Arguments");
			for (Expression e : callExpression.getArguments()) {
				visitNode(e);
			}
		}
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final ReturnStatement returnStatement)
	{
		indent();
		writer.println("ReturnStatement");
		indentation += increment;
		if (returnStatement.getExpression() != null)
		{
			indent();
			writer.println("Expression");
			visitNode(returnStatement.getExpression());
		}
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final TryStatement tryStatement)
	{
		indent();
		writer.println("TryStatement");
		indentation += increment;
		visitNode(tryStatement.getTryBlock());
		indent();
		writer.println("Identifier " + tryStatement.getCatchIdentifier());
		visitNode(tryStatement.getCatchBlock()); 
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final NewExpression newExpression)
	{
		indent();
		writer.println("NewExpression");
		indentation += increment;
		if (newExpression.getExp() != null)
		{
			visitNode(newExpression.getExp());
		}
		indentation -= increment;
		return null;
	}
	
	// visit the ASTs and dump them in order
	public Object visit(final PropertyAccessor propertyAccessor)
	{
		indent();
		writer.println("PropertyAccessor");
		indentation += increment;
		indent();
		writer.println("Base");
		indentation += increment;
		visitNode(propertyAccessor.getExpression()); 
		indentation -= increment;
		indent();
		writer.println("Property Name");
		indentation += increment;
		indent();
		writer.println("Identifier " + propertyAccessor.getIdentifierName());
		indentation -= increment;
		indentation -= increment;
		return null;
	}
	
	public Object visit(final This thisExpression)
	{
		indent();
		writer.println("this");
		return null;
	}

}

