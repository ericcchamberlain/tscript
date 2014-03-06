
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST var statement node
 *
 */
public final class EmptyStatement extends Statement
{

  public EmptyStatement(final Location loc)
  {
    super(loc);
  }

  /** Return the statement name as string */
  public String getName()
  {
    return new String("EmptyStatement");
  }

  /** Visit the AST node */
  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
}

