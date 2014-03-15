
package ts.tree;

import java.util.ArrayList;

import ts.Location;

/**
 * superclass for all AST statement nodes
 *
 */
public abstract class Statement extends SourceElement
{

	public ArrayList<String> labels = new ArrayList<>(); 

 	public Statement(final Location loc)
	{
	    super(loc);
	}

	public void addLabel(final String label)
	{
		labels.add(label);
	}

}

