
package ts.support;

import java.util.ArrayList;
import java.util.List;

import ts.tree.SourceElement;

/**
 * The class for all Function Object values.
 */
public final class TSFunctionObject extends TSObject
{
	private TSLexicalEnvironment scope; 
	private List<String> names; 
	private List<SourceElement> code;

	public TSFunctionObject(TSLexicalEnvironment scope, List<String> names,
	   List<SourceElement> code ) {
		super(); 
		this.names = new ArrayList<String>(); 
		this.code = new ArrayList<SourceElement>(); 
		this.scope = scope; 
		this.names.addAll(names);
		this.code.addAll(code);
	}

	public boolean isCallable()
	{
		return true;
	}

	public TSLexicalEnvironment getScope()
	{
		return scope;
	}
	
	public List<String> getNames()
	{
		return names;
	}
	
	public List<SourceElement> getCode()
	{
		return code; 
	}
	
	@Override
	public TSNumber toNumber() {
		// TODO 9.3 ToNumber - Not implemented 
		return TSNumber.zeroValue; 
	}

	@Override
	public TSBoolean toBoolean() {
		return TSBoolean.booleanTrue;
	}

	@Override
	public TSBoolean equalsOperator(TSValue right) {
		// TODO 11.9.1 - Not implemented  
		return TSBoolean.booleanTrue;
	}

	@Override
	public TSValue abstractRelationalComparison(TSValue right) {
		// TODO Not Implemented
		return TSNumber.zeroValue; 
	}

}


