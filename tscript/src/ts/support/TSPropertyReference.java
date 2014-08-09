
package ts.support;

/**
 * 
 */
public class TSPropertyReference extends TSReference
{
	
	private TSObject base; 
	// name inherited  from TSReference 

	public TSPropertyReference(TSObject base, TSString name) {
		super(name);
		this.base = base;  
	}
	
	/** IsPropertyReference(V). Returns true if either the base value is an 
	 *  object or HasPrimitiveBase(V) is true; otherwise returns false.
	 *  http://www.ecma-international.org/ecma-262/5.1/#sec-8.7
	 */
	public boolean isPropertyReference()
	{
		return true;
	}

	/** getBase() returns the base Object
	 * @return the base
	 */
	public TSObject getBase() {
		return base;
	}

	/** setBase() sets the base Object 
	 * @param base the base to set
	 */
	public void setBase(TSObject base) {
		this.base = base;
	}

	/** isUnresolvableReference(). Returns true if the base value is undefined 
	 *  and false otherwise.
	 *  http://www.ecma-international.org/ecma-262/5.1/#sec-8.7
	 */
	@Override
	boolean isUnresolvableReference() {
		if (this.base instanceof TSUndefined)
		{
			return true;
		}
		return false; 
	}

	@Override
	public TSBoolean equalsOperator(TSValue right) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TSValue abstractRelationalComparison(TSValue right) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TSObject toObject() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//https://piazza.com/class/hpc07xo86m62tn?cid=108
	//implement the getValue and putValue methods in this class
	
	public void putValue(TSValue value)
	{
		base.addProperty(name, value);
	}
	
	public TSValue getValue()
	{
		return base.getProperty(name);
	}
	
}


