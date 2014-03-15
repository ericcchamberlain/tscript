package ts.tree;

import java.util.ArrayList;
import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class LabelledStatement extends Statement{

	private String identifier;
	private Statement statement;
	
	public LabelledStatement(Location loc, final String i, final Statement s) {
		super(loc);
		this.identifier = i;
		this.statement = s; 
	}

	/** Returns the identifier name */
	public String getIdentifierName()
	{
		return this.identifier; 
	}

	/** Returns the statement */
	public Statement getStatement()
	{
		return this.statement; 
	}
	
	/** Visit the AST node */ 
	public <T> T apply(TreeVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
