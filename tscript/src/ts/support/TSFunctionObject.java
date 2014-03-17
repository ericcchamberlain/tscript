
package ts.support;

/**
 * The class for all Function Object values.
 */
public final class TSFunctionObject extends TSObject
{
	private TSLexicalEnvironment scope; 
	private List<String> names = new ArrayList(); 
	private List<SourceElement> code = new ArrayList(); 

	public TSFunctionObject(Location loc, TSLexicalEnvironment s, List<String> n,
	   List<SourceElement> c ) {
		super(loc);
		this.scope = s; 
		this.names.addAll(n);
		this.code.addAll(c);
	}

	public boolean isCallable()
	{
		return true;
	}

}


