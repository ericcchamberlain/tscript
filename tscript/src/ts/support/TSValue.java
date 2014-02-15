
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

	abstract public TSBoolean equalsOperator(final TSValue right);
	
	abstract public TSValue abstractRelationalComparison(final TSValue right);

	public TSBoolean lessThanOperator(final TSValue right)
	{
		TSValue r = this.getValue().toPrimitive().abstractRelationalComparison(right.getValue().toPrimitive());
		if (r instanceof TSUndefined) 
		{
			return TSBoolean.create(false);
		}
		else 
		{
			return r.toBoolean(); 
		}
	}
	
	public TSBoolean greaterThanOperator(final TSValue right)
	{
		TSValue r = right.getValue().toPrimitive().abstractRelationalComparison(this.getValue().toPrimitive());
		if (r instanceof TSUndefined) 
		{
			return TSBoolean.create(false);
		}
		else 
		{
			return r.toBoolean(); 
		}
	}

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
	
	/** Perform a subtraction. "this" is the left operand and the right
	 *  operand is given by the parameter. Both operands are converted
	 *  to Number before the subtraction.
	 */
	public final TSPrimitive subtract(final TSValue right)
	{
		TSPrimitive leftValue = this.toPrimitive();
		TSPrimitive rightValue = right.toPrimitive();

		return TSNumber.create(leftValue.toNumber().getInternal() -
				rightValue.toNumber().getInternal());
	}

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

