package ts.tree;

import java.util.ArrayList;
import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class IfStatement extends Statement{

	private Expression e;
	private Statement s1;
	private Statement s2;
	
	public IfStatement(Location loc, final Expression e, final Statement s1, final Statement s2) {
		super(loc);
		this.e = e;
		this.s1 = s1;
		this.s2 = s2;
	}

	/** Returns the expression */
	public Expression getIfExpression()
	{
		return this.e; 
	}

	/** Returns the first statement */
	public Statement getIfThenStatement()
	{
		return this.s1; 
	}

	/** Returns the second statement */
	public Statement getElseStatement()
	{
		return this.s2; 
	}
	
	/** Visit the AST node */ 
	public <T> T apply(TreeVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
