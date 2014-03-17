
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST FunctionExpression node
 *
 */
public class FunctionExpression extends Expression
{
  private String identifier;
  private List<String> formalParameters = new ArrayList<>();  
  private List<SourceElement> functionBody = new ArrayList<>(); 

  public FunctionExpression(final Location loc, final String ident,
     final List<String> parameters, final List<SourceElement> body)
  {
    super(loc);
    this.identifier = ident;
    if (parameters != null) 
    {
      this.formalParameters = parameters;
    }
    if (functionBody != null)
    {
      this.functionBody = body;
    }
  }

  /** Returns the name of the Identifier */
  public String getIdentifierName()
  {
    return identifier;
  }

  /** Returns a list containing the formal paramerters */
  public List<String> getFormalParameters()
  {
    return formalParameters;
  }

  /** Returns a list containing the formal paramerters */
  public List<SourceElement> getFunctionBody()
  {
    return functionBody;
  }

  /** Visit the AST node */
  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }

}

