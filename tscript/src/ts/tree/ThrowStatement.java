package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class ThrowStatement extends Statement{

	private Expression expression = null; 
	
	public ThrowStatement(Location loc, final Expression exp) {
		super(loc);
		this.expression = exp; 
	}

	/** Returns the expression */
	public Expression getExpression()
	{
		return this.expression; 
	}
	
	/** Visit the AST node */ 
	public <T> T apply(TreeVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
