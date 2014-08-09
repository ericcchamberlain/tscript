
package ts.tree;

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
  private List<Expression> args;

  public NewExpression(final Location loc, final Expression exp, final List<Expression> args)
  {
    super(loc);
    this.exp = exp;
    this.args = args; 
  }

  public Expression getExp()
  {
    return exp;
  }

  public List<Expression> getArgs()
  {
    return args;
  }

  /** Visit the AST node */
  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }

}

