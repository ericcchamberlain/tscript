package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class TryStatement extends Statement{

	private Statement tryBlock = null; 
	private String catchID = null;
	private Statement catchBlock = null;
	private Statement finallyBlock = null;
	
	public TryStatement(final Location loc, final Statement b1, 
		final String id, final Statement b2, final Statement b3) {
		super(loc);
		this.tryBlock = b1;
		this.catchID = id;
		this.catchBlock = b2;
		this.finallyBlock = b3; 
	}

	/** Returns the Identifier of the catch in the try statement */
	public String getCatchIdentifier()
	{
		return this.catchID; 
	}

	/** Returns the catch block of the try statement*/
	public Statement getCatchBlock()
	{
		return this.catchBlock; 
	}

	/** Returns the try block of the try statement */
	public Statement getTryBlock()
	{
		return this.tryBlock; 
	}

	/** Returns the finally block of the try statement */
	public Statement getFinallyBlock()
	{
		return this.finallyBlock; 
	}
	
	/** Visit the AST node */ 
	public <T> T apply(TreeVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
