package ts.tree;

import java.util.ArrayList;
import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class BreakStatement extends Statement{

	private String identifier = null; 
	
	public BreakStatement(Location loc, String ident) {
		super(loc);
		this.identifier = ident; 
	}

	/** Returns the Identifier of the break statement */
	public String getIdentifier()
	{
		return this.identifier; 
	}
	
	/** Visit the AST node */ 
	public <T> T apply(TreeVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
