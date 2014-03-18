
package ts.tree;

import java.util.ArrayList;
import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST Call expression 
 *
 */
public final class CallExpression extends Expression
{
  private Expression expression;
  private List<Expression> arguments = new ArrayList<Expression>(); 

  public CallExpression(final Location loc, final Expression expr, final List<Expression> args)
  {
    super(loc);
    this.expression = expr;
    this.arguments.addAll(args);
  }

  /** Returns the Expression */
  public Expression getExpression()
  {
    return expression;
  }

  /** Returns the Expression */
  public List<Expression> getArguments()
  {
    return arguments;
  }

  /** Visit the AST node */
  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
  
}

