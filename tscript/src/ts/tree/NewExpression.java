
package ts.tree;

import java.util.ArrayList;
import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST FunctionExpression node
 *
 */
public class NewExpression extends Expression
{
  
  private Expression exp;

  public NewExpression(final Location loc, final Expression exp)
  {
    super(loc);
    this.exp = exp;
  }

  public Expression getExp()
  {
    return exp;
  }

  /** Visit the AST node */
  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }

}

