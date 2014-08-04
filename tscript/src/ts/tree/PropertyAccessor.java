
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST property accessor expression node
 *
 */
public final class PropertyAccessor extends Expression
{

  private Expression expression;
  private String identifier;

  public PropertyAccessor(final Location loc, final Expression exp, final String i)
  {
    super(loc);
    this.expression = exp;
    this.identifier = i;
  }

  /** Returns the Expression */
  public Expression getExpression()
  {
    return expression;
  }

  /** Returns the identifier name */
  public String getIdentifierName()
  {
    return identifier; 
  }

  /** Visit the AST node */
  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
}

