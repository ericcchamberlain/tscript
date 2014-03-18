
package ts.tree.visit;

import ts.tree.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Base implementation for AST visitors. Performs complete traversal
 * but does nothing. Parameterized by return value.
 * <p>
 * The "visit" method is overloaded for every tree node type.
 */
public class TreeVisitorBase<T> implements TreeVisitor<T>
{
  // override to add pre- and/or post-processing
  protected T visitNode(final Tree node)
  {
    return node.apply(this);
  }

  // visit a list of ASTs and return list of results
  // use wildcard to allow general use, with list of Statements, list
  //   of Expressions, etc
  protected List<T> visitEach(final Iterable<?> nodes)
  {
    final List<T> visited = new ArrayList<T>();
    for (final Object node : nodes)
    {
      visited.add(visitNode((Tree) node));
    }
    return visited;
  }
  
  public T visit(final BinaryOperator binaryOperator)
  {
    visitNode(binaryOperator.getLeft());
    visitNode(binaryOperator.getRight());
    return null;
  }

  public T visit(final UnaryOperator unaryOperator)
  {
    visitNode(unaryOperator.getChild());
    return null;
  }

  public T visit(final ExpressionStatement expressionStatement)
  {
    visitNode(expressionStatement.getExp());
    return null;
  }

  public T visit(final Identifier identifier)
  {
    return null;
  }

  public T visit(final NumericLiteral numericLiteral)
  {
    return null;
  }
  
  public T visit(final BooleanLiteral booleanLiteral)
  {
    return null;
  }
  
  public T visit(final StringLiteral stringLiteral)
  {
    return null;
  }

  public T visit(final PrintStatement printStatement)
  {
    visitNode(printStatement.getExp());
    return null;
  }

  public T visit(final VarStatement varStatement)
  {
    return null;
  }

  public T visit(NullLiteral nullLiteral) 
  {
    return null;
  }
  
  public T visit(VariableDeclarationList variableDeclarationList) 
  {
    return null;
  }
  
  public T visit(IdentifierInitializerTuple identifierInitializerTuple) 
  {
	 return null;
  }
  
  public T visit(EmptyStatement emptyStatement) 
  {
	 return null;
  }

  public T visit(BlockStatement blockStatement) 
  {
    return null;
  }

  public T visit(IfStatement ifStatement) 
  {
    return null;
  }

  public T visit(WhileStatement whileStatement) 
  {
    return null;
  }

  public T visit(BreakStatement breakStatement) 
  {
    return null;
  }
  
  public T visit(ContinueStatement continueStatement) 
  {
    return null;
  } 

  public T visit(LabelledStatement labelledStatement) 
  {
    return null;
  } 
  
  public T visit(FunctionExpression functionExpression)
  {
	  return null;
  }

  public T visit(CallExpression callExpression)
  {
	  return null;
  }

	public T visit(ReturnStatement returnStatement) 
	{
		return null;
	}

  
}

