
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST unary operator node
 *
 */
public class UnaryOperator extends Expression
{
  private Unary op;
  private Expression child;

  public UnaryOperator(final Location loc, final Unary op,
     final Expression child)
  {
    super(loc);
    this.op = op;
    this.child = child;
  }

  public Unary getOp()
  {
    return op;
  }

  /** Convert operator kind to (Java) String for displaying. */
  public String getOpString()
  {
    return op.toString();
  }

  public Expression getChild()
  {
    return child;
  }

  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
  
}

