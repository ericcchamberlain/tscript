
package ts.tree;

import ts.Location;

/**
 * superclass for all AST statement nodes
 *
 */
public abstract class Statement extends SourceElement
{
  public Statement(final Location loc)
  {
    super(loc);
  }
}

