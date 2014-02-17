
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST numeric literal expression leaf node
 *
 */
public final class NumericLiteral extends Expression
{
  private double value;

  public NumericLiteral(final Location loc, final double value)
  {
    super(loc);
    this.value = value;
  }

  /** Returns the numeric literal values as double */
  public double getValue()
  {
    return value;
  }

  /** Visit the AST node */
  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
}

