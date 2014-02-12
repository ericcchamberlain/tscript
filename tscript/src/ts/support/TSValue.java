
package ts.support;

import ts.Message;

/**
 * The super class for all Tscript values.
 */
public abstract class TSValue
{
	//
	// References: i.e. getValue and putValue (section 8.7)
	//

	/** Get the value. This method is only overridden in TSReference.
	 *  Otherwise just return "this".
	 */
	public TSValue getValue()
	{
		return this;
	}

	/** Assign to the value. This method is only overridden in TSReference.
	 *  Otherwise just report an error.
	 */
	public void putValue(TSValue value)
	{
		Message.evaluationError("reference expected");
	}

	//
	// conversions (section 9)
	//

	/** Convert to Primitive. Override only in TSObject and TSReference.
	 *  Otherwise just return "this". Note: type hint is not implemented.
	 */
	TSPrimitive toPrimitive()
	{
		return (TSPrimitive) this;
	}

	abstract public TSNumber toNumber();

	abstract public TSBoolean toBoolean();


	/** Convert to String. Override for all primitive types and TSReference.
	 *  It can't be called toString because of Object.toString.
	 */
	public TSString toStr()
	{
		TSPrimitive prim = this.toPrimitive();
		return prim.toStr();
	}


	//
	// binary operators (sections 11.5-11.11)
	//

	/** Perform a multiply. "this" is the left operand and the right
	 *  operand is given by the parameter. Both operands are converted
	 *  to Number before the multiply.
	 */
	public final TSNumber multiply(final TSValue right)
	{
		TSNumber leftValue = this.toNumber();
		TSNumber rightValue = right.toNumber();
		return TSNumber.create(leftValue.getInternal() * rightValue.getInternal());
	}

	/** Perform an addition. "this" is the left operand and the right
	 *  operand is given by the parameter. Both operands are converted
	 *  to Number before the addition.
	 */
	public final TSPrimitive add(final TSValue right)
	{
		TSPrimitive leftValue = this.toPrimitive();
		TSPrimitive rightValue = right.toPrimitive();

		return TSNumber.create(leftValue.toNumber().getInternal() +
				rightValue.toNumber().getInternal());
	}

	abstract public TSBoolean equal(final TSValue right);
	
	/*
	public final TSBoolean equal(final TSValue right)
	{
		//if both values are TSNumeber 
		if ((this instanceof TSNumber) && (right instanceof TSNumber))
		{
			TSNumber tsnLeft = this.toNumber();
			TSNumber tsnRight = right.toNumber(); 
			// if left if NaN return false 
			if (Double.isNaN(tsnLeft.getInternal()))
			{
				return TSBoolean.create(false); 
			}
			// if right is NaN return false
			else if (Double.isNaN(tsnRight.getInternal()))
			{
				return TSBoolean.create(false); 
			}
			// if left is the same Number value as y, return true
			else if (tsnLeft.getInternal() == tsnRight.getInternal())
			{
				return TSBoolean.create(true); 
			}
			// TODO: if left is +0 and right is -0 return true
			// TODO: if left is -0 and right is +0 return true
			// I believe since +0 and -0 are equal in Java, that these two cases
			// will be picked up by the previously implemented case
			// -----------------------------------------------------------------
			// else return false
			else 
			{
				return TSBoolean.create(false);
			}
		}
//		else if ((this instanceof TSString) && (right instanceof TSString))
//		{
//			
//		}
		else 
		{
			return TSBoolean.create(false);
		}

	}
	*/


	/** Perform an assignment. "this" is the left operand and the right
	 *  operand is given by the parameter.
	 */
	public final TSValue simpleAssignment(final TSValue right)
	{
		TSValue rightValue = right.getValue();
		this.putValue(rightValue);
		return rightValue;
	}

	//
	// test for null and undefined
	//

	/** Is this value Undefined? Override only in TSUndefined and
	 *  TSReference.
	 */
	public boolean isUndefined()
	{
		return false;
	}

}

