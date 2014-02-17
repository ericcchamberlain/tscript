
package ts.support;

/**
 * Represents the single Undefined value
 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-8.1">ELS
 * 8.1).
 */
public final class TSNull extends TSPrimitive
{
	/** Single value for this singleton class. */
	public static final TSNull value = new TSNull();

	// hide the constructor
	private TSNull()
	{
	}

	public static TSNull create()
	{
		return value;
	}

	/** Convert to Number. null gets mapped to +0 */
	public TSNumber toNumber()
	{
		return TSNumber.create(+0); // TODO: Check if +0 is correct here 
	}

	/** Convert to Boolean. null gets mapped to false. */
	public TSBoolean toBoolean()
	{
		return TSBoolean.create(false); 
	}

	/** Convert to String ("null"). */
	public TSString toStr()
	{
		return TSString.create("null");
	}

	/** Eqality operator for the null type. */
	public TSBoolean equalsOperator(TSValue right) {
		if (right instanceof TSNull)
		{
			return TSBoolean.create(true);
		}
		else if (right instanceof TSUndefined)
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
	
	/** Abstract relational comparison for the null type. */
	public TSValue abstractRelationalComparison(final TSValue right)
	{
		return this.toNumber().abstractRelationalComparison(right);
	}

}

