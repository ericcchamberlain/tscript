
package ts.support;

import ts.Message;

/** A class to represent property references 
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
	
	/** putValue()
	 * sets the value 
	 */
	public void putValue(TSValue value)
	{
		//if the base is TSUndefined, then add the property to the global object
		if(base instanceof TSUndefined)
		{
			TSGlobalObject.getGlobalObject().addProperty(getReferencedName(), value);
		}
		else
		{
			base.addProperty(name, value);
			TSGlobalObject.getGlobalObject().thisObject.addProperty(name, value);
		}
	}
	
	/** getValue()
	 * gets the value of the reference 
	 */
	public TSValue getValue()
	{
		if (base.hasProperty(name)){
			return base.getProperty(name);
		}
		else if (TSGlobalObject.getGlobalObject().thisObject.hasProperty(name))//not to spec, needed for 'this'
		{
			return TSGlobalObject.getGlobalObject().thisObject.getProperty(name);
		}
		else
		{
			Message.evaluationError("undefined identifier: " +
					this.getReferencedName().getInternal());
			return null;
		}
	}
	
}


