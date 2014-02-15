
package ts.support;

/**
 * Represents the single Undefined value
 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-8.1">ELS
 * 8.1).
 */
public final class TSUndefined extends TSPrimitive
{
	/** Single value for this singleton class. */
	public static final TSUndefined value = new TSUndefined();

	// hide the constructor
	private TSUndefined()
	{
	}

	/** Convert to Number. Undefined gets mapped to NaN. */
	public TSNumber toNumber()
	{
		return TSNumber.create(Double.NaN);
	}

	/** Convert to String ("undefined"). */
	public TSString toStr()
	{
		return TSString.create("undefined");
	}

	/** Always returns true. */
	public boolean isUndefined()
	{
		return true;
	}

	/** Convert undefined to a Boolean 
	 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-9.2">ELS
	 * 9.2</a>)
	 */
	public TSBoolean toBoolean()
	{
		return TSBoolean.create(false); 
	}


	public TSBoolean equalsOperator(TSValue right) {
		if (right instanceof TSUndefined)
		{
			return TSBoolean.create(true);
		}
		else if (right instanceof TSNull)
		{
			return TSBoolean.create(true);
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
		return this.toNumber().abstractRelationalComparison(right);
	}

}

