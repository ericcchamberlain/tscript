package ts.tree;

import java.util.ArrayList;
import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class VariableDeclarationList extends Statement{

	private ArrayList<IdentifierInitializerTuple> tuples = new ArrayList<>(); 
	
	public VariableDeclarationList(Location loc, List<IdentifierInitializerTuple> value) {
		super(loc);
		this.tuples.addAll(value); 
	}

	/** Returns the ArrayList of IdentifierInitializerTuple */
	public ArrayList<IdentifierInitializerTuple> getTuples()
	{
		return this.tuples; 
	}
	
	/** Visit the AST node */ 
	public <T> T apply(TreeVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
