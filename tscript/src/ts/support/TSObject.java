
package ts.support;

import java.util.HashMap;


/**
 * The super class for all Tscript Object values.
 */
public class TSObject extends TSValue
{
	private TSObject prototype; 
	private HashMap<TSString, TSValue> properties; 
	
	protected TSObject()
	{
		 this.prototype = TSNull.value;
		 this.properties = new HashMap<TSString, TSValue>(); 
	}
	
	protected TSObject(TSObject prototype)
	{
		 this.prototype = prototype;
		 this.properties = new HashMap<TSString, TSValue>(); 
	}	
	
	public static TSObject create()
	{
		return new TSObject();
	}
	
	public static TSObject create(TSObject prototype)
	{
		return new TSObject(prototype);
	}

	@Override
	public TSNumber toNumber() {
		// TODO Auto-generated method stub
		// 9.3
		//Let primValue be ToPrimitive(input argument, hint Number).
		//Return ToNumber(primValue).
		return null;
	}

	/** toBoolean for Object returns true 
	 * http://www.ecma-international.org/ecma-262/5.1/#sec-9.2
	 */
	@Override
	public TSBoolean toBoolean() {
		// TODO Auto-generated method stub
		
		return TSBoolean.booleanTrue;
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
	
	
}


