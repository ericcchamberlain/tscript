package ts.tree;

import java.util.ArrayList;
import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class BlockStatement extends Statement{

	private ArrayList<Statement> sl = new ArrayList<>(); 
	
	public BlockStatement(Location loc, List<Statement> value) {
		super(loc);
		this.sl.addAll(value); 
	}

	/** Returns the ArrayList of Statements */
	public ArrayList<Statement> getStatements()
	{
		return this.sl; 
	}
	
	/** Visit the AST node */ 
	public <T> T apply(TreeVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
