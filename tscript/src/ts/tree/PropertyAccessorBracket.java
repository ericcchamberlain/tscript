
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST property accessor expression node
 *
 */
public final class PropertyAccessorBracket extends Expression
{

  private Expression expression;
  private Expression innerExpresion;
  private boolean call;

  public PropertyAccessorBracket(final Location loc, final Expression exp, final Expression innerExpression, final boolean call)
  {
    super(loc);
    this.expression = exp;
    this.innerExpresion = innerExpression;
    this.call = call; 
  }

  /** Returns the Expression */
  public Expression getExpression()
  {
    return expression;
  }

  /** Returns the innerExpression */
  public Expression getInnerExpression()
  {
    return innerExpresion; 
  }

  /** Visit the AST node */
  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
  
  public boolean isCall() {
	  return this.call; 
  }
}

