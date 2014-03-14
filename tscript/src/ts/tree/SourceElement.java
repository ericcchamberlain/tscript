
package ts.tree;

import ts.Location;

/**
 * superclass for all AST statement nodes
 *
 */
public abstract class SourceElement extends Node
{
  public SourceElement(final Location loc)
  {
    super(loc);
  }
}