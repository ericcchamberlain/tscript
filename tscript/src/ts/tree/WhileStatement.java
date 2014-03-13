package ts.tree;

import java.util.ArrayList;
import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class WhileStatement extends Statement{

	private Expression e;
	private Statement s;
	
	public WhileStatement(Location loc, final Expression e, final Statement s) {
		super(loc);
		this.e = e;
		this.s = s;
	}

	/** Returns the expression */
	public Expression getExpression()
	{
		return this.e;
	}

	/** Returns the statement */
	public Statement getStatement()
	{
		return this.s;
	}
	
	/** Visit the AST node */ 
	public <T> T apply(TreeVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
