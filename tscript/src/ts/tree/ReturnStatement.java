package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class ReturnStatement extends Statement{

	private Expression expression = null; 
	
	public ReturnStatement(Location loc, Expression expr) {
		super(loc);
		this.expression = expr; 
	}

	/** Returns the Identifier of the break statement */
	public Expression getExpression()
	{
		return this.expression; 
	}
	
	/** Visit the AST node */ 
	public <T> T apply(TreeVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
