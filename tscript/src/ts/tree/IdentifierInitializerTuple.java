package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class IdentifierInitializerTuple extends Node{

	private final Identifier ident;
	private final Expression expr;
	
	public IdentifierInitializerTuple(final Location loc, final String i, final Expression e)
	  {
	    super(loc);
	    this.ident = new Identifier(loc, i);
	    this.expr = e;
	  }

	/** Returns the tuple identifier */
	public Identifier getIdentifier()
	{
		return this.ident; 
	}
	
	/** Returns the tuple expression */ 
	public Expression getExpression()
	{
		return this.expr; 
	}
	
	/** Visit the AST node */
	public <T> T apply(TreeVisitor<T> visitor) 
	{
		return visitor.visit(this);
	}
}
