
package ts.support;

import java.util.HashMap;

/**
 * The super class for all Tscript Object values.
 */
public class TSObject extends TSValue
{
	private TSObject prototype; 
	private HashMap<TSString, TSValue> properties; 
		
	// TODO
	/* 15.2.4.1 The value of the [[Prototype]] internal property of the Object prototype 
	 * object is null, the value of the [[Class]] internal property is "Object", and the 
	 * initial value of the [[Extensible]] internal property is true.
	 */
	
	public TSObject()
	{
		 this.setPrototype(TSNull.value);
		 this.properties = new HashMap<TSString, TSValue>(); 
	}
	
	public TSObject(TSObject prototype)
	{
		 this.setPrototype(prototype);
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
	
	/** constructor()
	 * When the Object constructor is called with no arguments or with one
	 * argument value, the following steps are taken: 
	 * @return TSObject value 
	 * 15.2.2.1
	 */
	public TSObject constructor(TSValue value)
	{
		//1. If value is supplied, then
		if (value != null)
		{
			//a. If Type(value) is Object, then
			if (value instanceof TSObject)
			{
				//i. If the value is a native ECMAScript object, do not create a new object but simply return value.
				return (TSObject) value; 
				//ii. If the value is a host object, then actions are taken and a result is returned in an implementation-dependent manner that may depend on the host object.
			}
			//b. If Type (value) is String, return ToObject(value).
			//c. If Type(value) is Boolean, return ToObject(value).
			//d. If Type(value) is Number, return ToObject(value).
			if ((value instanceof TSString) || (value instanceof TSBoolean) || (value instanceof TSNumber))
			{
				return value.toObject();
			}
		}
		//2. Assert: The argument value was not supplied or its type was Null or Undefined.
		if ((value instanceof TSNull) || (value instanceof TSUndefined))
		{
			System.out.println("Error: cannot construct an object of type Null or Undefined");
			return null;
		}
		//3. Let obj be a newly created native ECMAScript object.
		TSObject obj = TSObject.create(); 
		//4. Set the [[Prototype]] internal property of obj to the standard built-in Object prototype object (15.2.4).
		//5. Set the [[Class]] internal property of obj to "Object".
		//6. Set the [[Extensible]] internal property of obj to true.
		//7. Set all the internal methods of obj as specified in 8.12.
		//8. Return obj.
		return obj; 
	}
	

	@Override
	public TSObject toObject() {
		return this; 
	}

	public void addProperty(TSString name, TSValue value)
	{
		properties.put(name, value);
	}
	
	public TSValue getProperty(TSString name)
	{
		TSValue returnValue = properties.get(name);
		if (returnValue == null)
		{
			return TSUndefined.value;
		}
		return returnValue; 
	}
	
	public boolean hasProperty(TSString name)
	{
		return properties.containsKey(name); 
	}
	
	public void removeProperty(TSString name)
	{
		properties.remove(name);
	}

	/**
	 * @return the prototype
	 */
	public TSObject getPrototype() {
		return prototype;
	}

	/**
	 * @param prototype the prototype to set
	 */
	public void setPrototype(TSObject prototype) {
		this.prototype = prototype;
	}
	
}


