
package ts.support;

/**
 * Represent Boolean values
 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-8.5">ELS
 * 5.1</a>).
 */
public final class TSBoolean extends TSPrimitive
{
	/** pre-built value for true */
	public static final TSBoolean booleanTrue = new TSBoolean(true);
	/** pre-built value for false */
	public static final TSBoolean booleanFalse = new TSBoolean(false);

	// use the "create" method instead
	private TSBoolean(final boolean value)
	{
		this.value = value;
	}

	private final boolean value;

	/** Create a Boolean with the given value. */
	public static TSBoolean create(final boolean value)
	{
		if (value == true)
		{
			return booleanTrue;
		}
		else 
			return booleanFalse;
	}

	/** Get the value. */
	public boolean getInternal()
	{
		return value;
	}

	/** Convert to a Boolean 
	 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-9.2">ELS
	 * 9.2</a>)
	 */
	public TSBoolean toBoolean()
	{
		return this; 
	}

	/** Convert to a Number, so nothing to do. */
	public TSNumber toNumber()
	{
		if(value == true)
			return TSNumber.oneValue;
		else
			return TSNumber.zeroValue; 
	}

	/** Convert Boolean to String
	 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-9.8">ELS
	 * 9.8</a>)
	 */
	public TSString toStr()
	{
		if (value == true)
		{
			return TSString.create("true");
		}
		else 
			return TSString.create("false");
	}

	public TSBoolean equal(TSValue right) {
		if (right instanceof TSBoolean)
		{
			TSBoolean tsbLeft = this.toBoolean(); 
			TSBoolean tsbRight = right.toBoolean(); 
			if (tsbLeft.value == tsbRight.value)
			{
				return TSBoolean.create(true);
			}
			else
			{
				return TSBoolean.create(false);
			}
		}
		else 
		{
			return TSBoolean.create(false);
		}
	}
}



