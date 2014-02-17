
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST null literal expression leaf node
 *
 */
public final class NullLiteral extends Expression
{
	
  public NullLiteral(final Location loc)
  {
    super(loc);
  }

  /** Visit the AST node */
  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
  
}

