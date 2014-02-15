
package ts.support;

/**
 * Represents (Tscript) String values
 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-8.4">ELS
 * 8.4</a>).
 * <p>
 * This class only currently allows String values to be created and does
 * not yet support operations on them.
 */
public final class TSString extends TSPrimitive
{

	private final String value;

	// use the "create" method instead
	private TSString(final String value)
	{
		this.value = value;
	}

	/** Get the value of the String. */
	public String getInternal()
	{
		return value;
	}

	/** Overrides Object.equals because TSString used as key for Map */
	public boolean equals(Object anObject)
	{
		if (anObject instanceof TSString)
		{
			return value.equals(((TSString) anObject).getInternal());
		}
		return false;
	}

	/** Need to override Object.hashcode() when overriding Object.equals() */
	public int hashCode()
	{
		return value.hashCode();
	}

	/** Create a Tscript String from a Java String. */
	public static TSString create(final String value)
	{
		// could use hashmap to screen for common strings?
		return new TSString(value);
	}

	/** Convert String to Number. Not yet Implemented. */
	public TSNumber toNumber()
	{
		// TODO: MAKING ASSUMPTION THAT JAVA AND JAVASCRIPT DO THIS THE SAME WAY. 
		try {
			double d = Double.parseDouble(value);
			return TSNumber.create(d);
		} catch (Exception e) {
			return TSNumber.create(Double.NaN);
		}
	}


	/** Convert String to String. */
	public TSString toStr()
	{
		return this;
	}

	/** Convert String to a Boolean 
	 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-9.2">ELS
	 * 9.2</a>)
	 */
	public TSBoolean toBoolean()
	{
		if( value.length() > 0 )   
			return TSBoolean.create(true);
		else
			return TSBoolean.create(false);
	}

	public TSBoolean equalsOperator(TSValue right) {
		if (right instanceof TSNumber)
		{
			return this.toNumber().equalsOperator(right); 
		}
		else if (right instanceof TSString)
		{
			if(this.getInternal() == right.toStr().getInternal())
			{
				return TSBoolean.create(true);
			}
			else
			{
				return TSBoolean.create(false);
			}
		}
		else if (right instanceof TSBoolean)
		{
			return this.equalsOperator(right.toNumber());
		}
		else 
		{
			return TSBoolean.create(false);
		}
	}
	
	public TSValue abstractRelationalComparison(final TSValue right)
	{
		if (right instanceof TSString)
		{
			if (this.getInternal().compareTo(right.toStr().getInternal()) <= 0)
			{
				return TSBoolean.booleanFalse;
			}
			else
			{
				return TSBoolean.booleanTrue; 
			}
		}
		else
		{
			return this.toNumber().abstractRelationalComparison(right);
		}
	}
}

