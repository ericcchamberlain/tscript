package ts.support;

/** TSGlobalObject
 * A Singleton class for the global object 
 * @author ericcchamberlain
 *
 */
public class TSGlobalObject extends TSObject
{
	private static TSGlobalObject globalObject = null;
	public TSObject thisObject; 
	
	protected TSGlobalObject()
	{
		// singleton - only one global object 
	}
	
	/** getGlobalObject() 
	 *  returns the singleton global object 
	 * 
	 */
	public static TSGlobalObject getGlobalObject() 
	{
		if(globalObject == null)
		{
			globalObject = new TSGlobalObject();
			globalObject.createInternalProperties(); 
			globalObject.thisObject = new TSObject(); 
		}
		return globalObject; 
	}
	
	/** createInternalProperties()
	 *  creates the internal properties of the global object 
	 */
	private void createInternalProperties()
	{
		globalObject.addProperty(TSString.create("undefined"), TSUndefined.value);
		globalObject.addProperty(TSString.create("NaN"), TSNumber.create(Double.NaN));
		globalObject.addProperty(TSString.create("Infinity"), TSNumber.create(Double.POSITIVE_INFINITY));
		globalObject.addProperty(TSString.create("isNaN"), null); //used to bind the name only, func is call visitor
		globalObject.addProperty(TSString.create("isFinite"), null); //used to bind the name only, func in call visitor 
	} 

}
