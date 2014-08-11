package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

public class This extends Expression{

	public This(Location loc) {
		super(loc);
	}

	@Override
	public <T> T apply(TreeVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
