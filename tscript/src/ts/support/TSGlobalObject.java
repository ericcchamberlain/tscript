package ts.support;

public class TSGlobalObject extends TSObject
{
	private static TSGlobalObject globalObject = null;
	
	protected TSGlobalObject()
	{
		// singleton - only one global object 
	}
	
	public static TSGlobalObject getGlobalObject() 
	{
		if(globalObject == null)
		{
			globalObject = new TSGlobalObject();
			globalObject.createInternalProperties(); 
		}
		return globalObject; 
	}
	
	private void createInternalProperties()
	{
		globalObject.addProperty(TSString.create("undefined"), TSUndefined.value);
		globalObject.addProperty(TSString.create("NaN"), TSNumber.create(Double.NaN));
		globalObject.addProperty(TSString.create("Infinity"), TSNumber.create(Double.POSITIVE_INFINITY));
		globalObject.addProperty(TSString.create("isNaN"), null);
		globalObject.addProperty(TSString.create("isFinite"), null);
	}

}
