
package ts.support;

/**
 * Represent Number values
 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-8.5">ELS
 * 5.1</a>).
 */
public final class TSNumber extends TSPrimitive
{
	/** pre-built value for 0 */
	public static final TSNumber zeroValue = new TSNumber(0.0);
	/** pre-built value for 1 */
	public static final TSNumber oneValue = new TSNumber(1.0);

	// use the "create" method instead
	private TSNumber(final double value)
	{
		this.value = value;
	}

	private final double value;

	/** Create a Number with the given value. */
	public static TSNumber create(final double value)
	{
		// could screen for more common values?
		// even use a hashmap?
		if (value == 0.0)
		{
			return zeroValue;
		}
		else if (value == 1.0)
		{
			return oneValue;
		}
		return new TSNumber(value);
	}

	/** Get the value. */
	public double getInternal()
	{
		return value;
	}

	/** Convert to a Number, so nothing to do. */
	public TSNumber toNumber()
	{
		return this;
	}

	/** Convert to a Boolean 
	 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-9.2">ELS
	 * 9.2</a>)
	 */
	public TSBoolean toBoolean()
	{
		//TODO: Check if -0, +0, NaN is correct here 
		if((value == +0) || (value == -0) || (Double.isNaN(value)))   
			return TSBoolean.create(false);
		else
			return TSBoolean.create(true);
	}

	/** Eqality operator for the number type. 
	 *
	 */
	public TSBoolean equalsOperator(final TSValue right)
	{
		//if both values are TSNumeber 
		if (right instanceof TSNumber)
		{
			TSNumber tsnRight = right.toNumber();
			// if left if NaN return false 
			if (Double.isNaN(this.getInternal()))
			{
				return TSBoolean.create(false); 
			}
			// if right is NaN return false
			else if (Double.isNaN(tsnRight.getInternal()))
			{
				return TSBoolean.create(false); 
			}
			// if left is the same Number value as y, return true
			else if (this.getInternal() == tsnRight.getInternal())
			{
				return TSBoolean.create(true); 
			}
			// TODO: if left is +0 and right is -0 return true
			// TODO: if left is -0 and right is +0 return true
			// I believe since +0 and -0 are equal in Java, that these two cases
			// will be picked up by the previously implemented case
			// -----------------------------------------------------------------
			else 
			{
				return TSBoolean.create(false);
			}
		}
		else if (right instanceof TSString)
		{
			//return left == ToNumber(right) 
			return this.equalsOperator(right.toNumber());  //TODO: Check if this is correct 
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

	/** Abstract relational comparison for the number type.
	 *  See 11.8.5 of the ECMA Specification
	 *  @param right  the value being compared to 
	 */
	public TSValue abstractRelationalComparison(final TSValue right)
	{
		TSNumber ny = right.toNumber();
		// if nx is NaN return undefined 
		if (Double.isNaN(this.getInternal())){
			return TSUndefined.value; 
		}
		// if ny is NaN return undefined 
		else if (Double.isNaN(ny.getInternal()))
		{
			return TSUndefined.value;
		}
		// if nx and ny are equal, return false
		// ( also covers +0 == -0 and -0 == +0 )
		else if (this.getInternal() == ny.getInternal())
		{
			return TSBoolean.booleanFalse;
		}
		// if nx is +infinity return false
		else if (this.getInternal() == Double.POSITIVE_INFINITY)
		{
			return TSBoolean.booleanFalse;
		}
		// if ny is +infinity return true
		else if (ny.getInternal() == Double.POSITIVE_INFINITY)
		{
			return TSBoolean.booleanTrue;
		}
		// if ny is -infinity return false
		else if (ny.getInternal() == Double.NEGATIVE_INFINITY)
		{
			return TSBoolean.booleanFalse;
		}
		// if nx is -infinity return true
		else if (this.getInternal() == Double.NEGATIVE_INFINITY)
		{
			return TSBoolean.booleanTrue;
		}
		// else if nx < ny return true
		else if (this.getInternal() < ny.getInternal())
		{
			return TSBoolean.booleanTrue;
		}
		// else return false 
		else 
		{
			return TSBoolean.booleanFalse;
		}
	}

	/** Convert Number to String
	 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-9.8.1">ELS
	 * 9.8.1</a>)
	 */
	public TSString toStr()
	{
		if (Double.isNaN(value))
		{
			return TSString.create("NaN");
		}

		if ((value == +0.0) || (value == -0.0))
		{
			return TSString.create("0");
		}

		boolean isNegative = false;
		String result = null;
		double temp = value;
		if (temp < 0.0)
		{
			isNegative = true;
			temp = -temp;
		}

		if (Double.isInfinite(temp))
		{
			result = "Infinity";
		}
		else
		{
			String tmp = String.format("%.15e", temp);
			byte buf[] = tmp.getBytes();
			byte out[] = new byte[tmp.length()];

			// 'e' will be at offset 17
			int p = 17;

			// get the exponent value
			p += 1;
			boolean expIsNegative = false;
			if (buf[p] == '-')
			{
				expIsNegative = true;
			}
			p += 1;
			int expValue = 0;
			while ((p < buf.length) && Character.isDigit(buf[p]))
			{
				expValue = (expValue * 10) + (buf[p] - '0');
				p += 1;
			}
			if (expIsNegative)
			{
				expValue = -expValue;
			}

			// truncate off trailing zeros in mantissa
			p = 16;
			while (buf[p] == '0')
			{
				p -= 1;
			}
			int k = p;
			int n = expValue + 1;
			int next = 0;

			int i;

			if ((k <= n) && (n <= 21))
			{
				out[next] = buf[0];
				next += 1;
				for (i = 1; i < k; i++)
				{
					out[next] = buf[i+1];
					next += 1;
				}
				for (i = 0; i < (n - k); i++)
				{
					out[next] = '0';
					next += 1;
				}
				result = new String(out, 0, next);
			}

			else if ((0 < n) && (n <= 21))
			{
				out[next] = buf[0];
				next += 1;
				for (i = 1; i < n; i++)
				{
					out[next] = buf[i+1];
					next += 1;
				}
				out[next] = '.';
				next += 1;
				for (; i < k; i++)
				{
					out[next] = buf[i+1];
					next += 1;
				}
				result = new String(out, 0, next);
			}

			else if ((-6 < n) && (n <= 0))
			{
				out[next] = '0';
				next += 1;
				out[next] = '.';
				next += 1;
				for (i = 0; i < -n; i++)
				{
					out[next] = '0';
					next += 1;
				}
				out[next] = buf[0];
				next += 1;
				for (i = 1; i < k; i++)
				{
					out[next] = buf[i+1];
					next += 1;
				}
				result = new String(out, 0, next);
			}

			else if (k == 1)
			{
				out[next] = buf[0];
				next += 1;
				out[next] = 'e';
				next += 1;
				String tmp2 = null;
				if ((n - 1) >= 0)
				{
					out[next] = '+';
					next += 1;
					tmp2 = String.format("%d", n - 1);
				}
				else
				{
					out[next] = '-';
					next += 1;
					tmp2 = String.format("%d", -(n - 1));
				}
				result = new String(out, 0, next) + tmp2;
			}

			else 
			{
				out[next] = buf[0];
				next += 1;
				out[next] = '.';
				next += 1;
				for (i = 1; i < k; i++)
				{
					out[next] = buf[i+1];
					next += 1;
				}
				out[next] = 'e';
				next += 1;
				String tmp2 = null;
				if ((n - 1) >= 0)
				{
					out[next] = '+';
					next += 1;
					tmp2 = String.format("%d", n - 1);
				}
				else
				{
					out[next] = '-';
					next += 1;
					tmp2 = String.format("%d", -(n - 1));
				}
				result = new String(out, 0, next) + tmp2;
			}
		}

		if (isNegative)
		{
			result = "-" + result;
		}

		return TSString.create(result);
	}

}



