
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST boolean literal expression leaf node
 *
 */
public final class BooleanLiteral extends Expression
{
  private boolean value;

  public BooleanLiteral(final Location loc, final boolean value)
  {
    super(loc);
    this.value = value;
  }

  /** Returns the value of the boolean */
  public boolean getValue()
  {
    return value;
  }

  /** Visit the AST node */
  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
}

