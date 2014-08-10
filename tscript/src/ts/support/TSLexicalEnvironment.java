
package ts.support;

/**
 * Represent lexical environments
 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-10.2">ELS
 * 10.2</a>).
 *
 */
public final class TSLexicalEnvironment
{
	private final TSEnvironmentRecord environmentRecord;
	private final TSLexicalEnvironment outerEnvironment;
	private TSGlobalObject globalObject; 

	private TSLexicalEnvironment(final TSEnvironmentRecord environmentRecord,
			final TSLexicalEnvironment outerEnvironment)
	{
		this.environmentRecord = environmentRecord;
		this.outerEnvironment = outerEnvironment;
		globalObject = TSGlobalObject.getGlobalObject();
	}

	/** Create a Reference
	 *  (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-8.7">ELS
	 *  8.7</a>)
	 *  for a reference to the given name in this environment.
	 */
	public TSReference getIdentifierReference(final TSString name)
	{
		//10.2.2.1 GetIdentifierReference (lex, name, strict)
		//
		//The abstract operation GetIdentifierReference is called with a Lexical Environment lex, an identifier String name, and a Boolean flag strict. The value of lex may be null. When called, the following steps are performed:
		//
		//If lex is the value null, then
		//Return a value of type Reference whose base value is undefined, whose referenced name is name, and whose strict mode flag is strict.
		//Let envRec be lexs environment record.
		//Let exists be the result of calling the HasBinding(N) concrete method of envRec passing name as the argument N.
		//If exists is true, then
		//Return a value of type Reference whose base value is envRec, whose referenced name is name, and whose strict mode flag is strict.
		//Else
		//Let outer be the value of lexs outer environment reference.
		//Return the result of calling GetIdentifierReference passing outer, name, and strict as arguments.
		if (environmentRecord.hasBinding(name))
		{
			return new TSEnvironmentReference(name, environmentRecord);
		}
		else
		{
			if (outerEnvironment == null)
			{
				// this is not correct
				// it should create a property reference with an undefined base
				// but we don't have properties yet
				// setting the base of an environment reference to null to indicate
				// that the identified is not declared
				// TODO: fix this when properties are being supported
				//return new TSEnvironmentReference(name, null);
				if(TSGlobalObject.getGlobalObject().hasProperty(name))
				{
					return new TSPropertyReference(TSGlobalObject.getGlobalObject(), name);
				}
				else
				{
					return new TSPropertyReference((TSObject)TSUndefined.value, name);
				}
			}
			return outerEnvironment.getIdentifierReference(name);
		}
	}

	/** Declare the name in this lexical environment. */
	public void declareVariable(final TSString name,
			final boolean configurableBinding)
	{
		// this method is not distinctly mentioned in the spec
		// but is part of the discussion in 10.5

		final boolean varAlreadyDeclared = environmentRecord.hasBinding(name);

		// if name already declared as parameter, for example, don't try to
		// create a binding for it again.
		if (!varAlreadyDeclared)
		{
			environmentRecord.createMutableBinding(name, configurableBinding);
			environmentRecord.setMutableBinding(name, TSUndefined.value);
		}
	}

	/** Declare a parameter and bind it to a value. See
	 *  @link http://www.ecma-international.org/ecma-262/5.1/#sec-10.5
	 *
	 *  @param rawName parameter name as a Java string.
	 *  @param value to bind the name to.
	 */
	public void declareParameter(final String rawName, TSValue value)
	{
		final TSString name = TSString.create(rawName);
		final boolean varAlreadyDeclared = environmentRecord.hasBinding(name);

		// we just created the environment so the binding should not exist
		// but the spec says to do this so I will do the check.
		// Perhaps I am confused about something  here?
		// I will put in an assert for now.
		if (!varAlreadyDeclared)
		{
			// note: second parameter is always false meaning the binding
			// cannot be deleted
			environmentRecord.createMutableBinding(name, false);
		}
		else
		{
			assert false : "binding already exists for parameter";
		}
		environmentRecord.setMutableBinding(name, value);
	}

	/** Declare a function name and bind it to a value. See
	 *  <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-13">ELS
	 *  13</a>.
	 *
	 *  @param rawName function name as a Java string.
	 *  @param value to bind the name to.
	 */
	public void declareFunctionName(final String rawName, TSValue value)
	{
		final TSString name = TSString.create(rawName);

		// it must be a declarative environment
		TSDeclarativeEnvironmentRecord dER =
				(TSDeclarativeEnvironmentRecord) environmentRecord;

		dER.createImmutableBinding(name);
		dER.initializeImmutableBinding(name, value);
	}

	/** Create a new declarative environment, which must be placed inside
	 *  a new lexical environment.
	 *
	 *  @param outer the enclosing lexical environment
	 */
	public static TSLexicalEnvironment newDeclarativeEnvironment(
			final TSLexicalEnvironment outer)
	{
		return new TSLexicalEnvironment(new TSDeclarativeEnvironmentRecord(),
				outer);
	}

}

