
package ts.tree.visit;

import ts.Message;
import ts.tree.*;
import ts.support.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Evaluate an AST. Parameterized by the "completion" type.
 * <p>
 * The "visit" method is overloaded for every tree node type.
 *
 */
public final class TreeEvaluate extends TreeVisitorBase<TSCompletion>
{	
	/* Declarative environment records are used to define the effect
	 * of ECMAScript language syntactic elements such as FunctionDeclarations,
	 * VariableDeclarations, and Catch clauses that directly associate
	 * identifier bindings with ECMAScript language values.
	 */
	// this is a declarative environment for now
	// TODO: change to an environment for the global object
	private TSLexicalEnvironment environment;
	private TSObject thisObject; 
	public Scanner scanner = new Scanner(System.in);
			
	public TreeEvaluate()
	{
		environment = TSLexicalEnvironment.newDeclarativeEnvironment(null);
		// add undefined to the lexical environment
		environment.declareVariable(TSString.create("undefined"), false);
		//10.4.1.1 set the ThisBinding to the global object.
		thisObject = TSGlobalObject.getGlobalObject();
	}
	
	// visit a list of ASTs and evaluate them in order
	// use wildcard for generality: list of Statements, list of Expressions, etc
	// an array must be returned but this will always return an array of size 1
	public List<TSCompletion> visitEach(final Iterable<?> nodes)
	{
		List<TSCompletion> ret = new ArrayList<TSCompletion>();

		for (final Object node : nodes)
		{
			TSCompletion completion = visitNode((Tree) node);
			if (!completion.isNormal())
			{
				ret.add(completion);
				return ret;
			} 
		}
		ret.add(TSCompletion.createNormalNull());
		return ret;
	}

	/** Visit the binary operator ASTs and evaluate 
	 *  @param binaryOperator  the binary operator AST
	 */
	public TSCompletion visit(final BinaryOperator binaryOperator)
	{
		TSCompletion left = visitNode(binaryOperator.getLeft());
		if (!left.isNormal())
		{
			return left;
		} 
		TSCompletion right = visitNode(binaryOperator.getRight());
		if (!right.isNormal())
		{
			return right;
		} 
		Message.setLocation(binaryOperator.getLoc());
		if (binaryOperator.getOp() == Binop.ADD)
		{
			left.setValue(left.getValue().add(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.SUBTRACT)
		{
			left.setValue(left.getValue().subtract(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.MULTIPLY)
		{
			left.setValue(left.getValue().multiply(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.DIVIDE)
		{
			left.setValue(left.getValue().divide(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.ASSIGN)
		{
			left.setValue(left.getValue().simpleAssignment(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.EQUAL)
		{
			left.setValue(left.getValue().getValue().equalsOperator(right.getValue().getValue()));
		}
		else if (binaryOperator.getOp() == Binop.GREATER)
		{
			left.setValue(left.getValue().greaterThanOperator(right.getValue()));
		}
		else if (binaryOperator.getOp() == Binop.LESS)
		{
			left.setValue(left.getValue().lessThanOperator(right.getValue()));
		}
		else
		{
			System.err.println("INVALID BINARY OPERATOR: " + binaryOperator.getOpString());
			//assert false : "unexpected binary operator";
		}
		return left;
	}

	/** Visit the unary operator ASTs and evaluate 
	 *  @param unaryOperator  the unary operator AST
	 */
	public TSCompletion visit(final UnaryOperator unaryOperator)
	{
		TSCompletion child = visitNode(unaryOperator.getChild());
		if (!child.isNormal())
		{
			return child;
		} 
		Message.setLocation(unaryOperator.getLoc());
		if (unaryOperator.getOp() == Unary.LOGICAL_NOT)
		{
			if(child.getValue().toBoolean() == TSBoolean.booleanTrue)
				child.setValue(TSBoolean.booleanFalse);
			else 
				child.setValue(TSBoolean.booleanTrue);
		} 
		else if (unaryOperator.getOp() == Unary.UNARY_MINUS)
		{
			//get the value, call toNumber, and inverse the sign
			child.setValue(TSNumber.create(-(child.getValue().toNumber().getInternal())));
		}
		else
		{
			System.err.println("INVALID UNARY OPERATOR: " + unaryOperator.getOpString());
			//assert false : "unexpected unary operator";
		}
		return child;
	}

	/** Visit the ExpressionStatement ASTs and evaluate 
	 *  @param expressionStatement  the ExpressionStatement to evaluate
	 */
	public TSCompletion visit(final ExpressionStatement expressionStatement)
	{
		TSCompletion completion = visitNode(expressionStatement.getExp());
		return completion;
	}

	/** Visit the Identifier ASTs and evaluate 
	 *  @param identifier  the Identifier to evaluate
	 */
	public TSCompletion visit(final Identifier identifier)
	{
		return TSCompletion.createNormal(environment.getIdentifierReference(
				TSString.create(identifier.getName())));
	}

	/** Visit the NumericLiteral ASTs and evaluate 
	 *  @param numericLiteral  the NumericLiteral to evaluate
	 */
	public TSCompletion visit(final NumericLiteral numericLiteral)
	{
		return TSCompletion.createNormal(TSNumber.create(
				numericLiteral.getValue()));
	}

	/** Visit the BooleanLiteral ASTs and evaluate 
	 *  @param booleanLiteral  the BooleanLiteral to evaluate
	 */
	public TSCompletion visit(final BooleanLiteral booleanLiteral)
	{
		return TSCompletion.createNormal(TSBoolean.create(
				booleanLiteral.getValue()));
	}
	
	/** Visit the StringLiteral ASTs and evaluate 
	 *  @param stringLiteral  the StringLiteral to evaluate
	 */
	public TSCompletion visit(final StringLiteral stringLiteral)
	{
		return TSCompletion.createNormal(TSString.create(
				stringLiteral.getValue()));
	}
	
	/** Visit the EmptyStatement ASTs and evaluate 
	 * 
	 */
	public TSCompletion visit(final EmptyStatement emptyStatement)
	{
		return TSCompletion.createNormalNull();
	}
	

	/** Visit the BlockStatement ASTs and evaluate 
	 * 
	 */
	public TSCompletion visit(final BlockStatement blockStatement)
	{
		// case: {  }  empty block
		if (blockStatement.getStatements() == null)
		{
			return TSCompletion.createNormalNull(); 
		}
		// case: { StatementList } 
		else 
		{
			// iterate through the array of statements, visiting each statement
			// return the completion of the last evaluated statement in the list
			TSCompletion completion = null;
			TSValue value = null; 
			for (Statement statement : blockStatement.getStatements()) {
				completion = visitNode((Tree) statement);
				// if completion is an abrupt completion, return completion 
				if (!completion.isNormal())
				{
					return completion;
				}
				//If s.value is empty, let V = sl.value, otherwise let V = s.value.
				// Return (s.type, V, s.target).
				if (completion.getValue() != null) 
				{
					value = completion.getValue(); 
				}
			}
			TSString target = null;
			// if the block statement is empty, return a null TSCompletion 
			if (completion == null)
			{
				return TSCompletion.createNormalNull(); 
			}
			if (completion.getTarget() != null)
			{
				target = completion.getTarget().toStr();
			}
			return TSCompletion.create(completion.getType(), value, target); 
		}
	}

	/** Visit the IfStatement ASTs and evaluate 
	 * 
	 */
	public TSCompletion visit(final IfStatement ifStatement)
	{
		TSCompletion expression = visitNode(ifStatement.getIfExpression()); 
		if (expression.getValue().toBoolean() == TSBoolean.booleanTrue)
		{
			//return the result of expression 1
			TSCompletion s1 = visitNode(ifStatement.getIfThenStatement());
			return s1; 
		}
		else 
		{
			if (ifStatement.getElseStatement() == null)
			{
				// if there is no else clause, return (normal, empty, empty)
				return TSCompletion.createNormalNull();
			} 
			else
			{
				TSCompletion s2 = visitNode(ifStatement.getElseStatement());
				return s2; 
			}
		}
	}

	/** Visit the WhileStatement ASTs and evaluate 
	 * 
	 */
	public TSCompletion visit(final WhileStatement whileStatement)
	{
		// Let V = empty.
		TSValue value = null;
		TSCompletion stmt = null;
		// Repeat.
		// Let exprRef be the result of evaluating Expression.
		TSCompletion exprRef = visitNode(whileStatement.getExpression());
		// If ToBoolean(GetValue(exprRef)) is false, return (normal, V, empty).
		while (exprRef.getValue().toBoolean() != TSBoolean.booleanFalse)
		{
			// Let stmt be the result of evaluating Statement.
			stmt = visitNode(whileStatement.getStatement());
			// If stmt.value is not empty, let V = stmt.value.
			if (stmt.getValue() != null) 
			{
				value = stmt.getValue(); 
			}
			//If stmt.type is not continue || stmt.target is not in the current label set, then
			if ((stmt.getType() != TSCompletionType.Continue) 
					|| ((stmt.getTarget() != null) && !(whileStatement.labels.contains(((TSString)stmt.getTarget()).getInternal()))))
			{
				// case: stmt.type is break   
				if (stmt.getType() == TSCompletionType.Break) 
				{
					// case: target is null
					if (stmt.getTarget() == null)
					{
						return TSCompletion.createNormal(value); 
					}
					// case: target is not null, so check if it is in the label set
					else if (whileStatement.labels.contains(((TSString) stmt.getTarget()).getInternal()))
					{
						// return normal if it is in the label set 
						return TSCompletion.createNormal(value); 
					}
					else 
					{
						// else return the abnormal completion type 
						return stmt; 
					}
				}
				else // case: handle normal and abrupt completion
				{
					if (!stmt.isNormal())
					{
						return stmt; // TODO: THIS IS NOT UP TO SPEC. !!! !!! !!! 
					}
				}
			}
			exprRef = visitNode(whileStatement.getExpression()); 
		}
		return TSCompletion.createNormal(value);
	}

	/** Visit the BreakStatement ASTs and evaluate 
	 * 
	 */
	public TSCompletion visit(final BreakStatement breakStatement)
	{
		String ident = breakStatement.getIdentifier(); 
		//case: no identifier 
		if (ident == null)
		{
			return TSCompletion.create(TSCompletionType.Break, null, null);
		}
		else  //case: with identifier 
		{
			return TSCompletion.create(TSCompletionType.Break, null, TSString.create(ident));
		}
	}
	
	/** Visit the ContinueStatement ASTs and evaluate 
	 * 
	 */
	public TSCompletion visit(final ContinueStatement continueStatement)
	{
		String ident = continueStatement.getIdentifier(); 
		//case: no identifier 
		if (ident == null)
		{
			return TSCompletion.create(TSCompletionType.Continue, null, null);
		}
		else  //case: with identifier 
		{
			return TSCompletion.create(TSCompletionType.Continue, null, TSString.create(ident));
		}
	}

	/** Visit the LabelledStatement ASTs and evaluate 
	 *  12.12 Labelled Statements
	 */
	public TSCompletion visit(final LabelledStatement labelledStatement)
	{
		// add the label to the statement before evaluation 
		String label = labelledStatement.getIdentifierName();
		Statement statement = labelledStatement.getStatement();
		statement.addLabel(label);
		// if the labelled statement itself is not empty label set, add
		// these labels to the statement before evaluating 
		if (!labelledStatement.labels.isEmpty())
		{
			statement.labels.addAll(labelledStatement.labels);
		}
		// evaluate the statement 
		// If the result of evaluating Statement is (break, V, L) where
		// L is equal to Identifier, the production results in (normal, V, empty).
		TSCompletion completion = visitNode(statement);
		if ((completion.getType() == TSCompletionType.Break)
				&& (((TSString)completion.getTarget()).getInternal().equals(TSString.create(labelledStatement.getIdentifierName()).getInternal()))) // Does this actually work ???
		{
			return TSCompletion.createNormal(completion.getValue());
		}
		return completion;  //   <--- The spec is a little unclear hear what to return if not a match
	}
	
	
	/** Visit the VariableDeclarationList ASTs and evaluate 
	 *  @param variableDeclarationList  the VariableDeclarationList to evaluate
	 */
	public TSCompletion visit(final VariableDeclarationList variableDeclarationList)
	{
		visitEach((Iterable<IdentifierInitializerTuple>)variableDeclarationList.getTuples());
		return TSCompletion.createNormalNull();
	}
	
	/** Visit the IdentifierInitializerTuple ASTs and evaluate 
	 *  @param identifierInitializerTuple  the IdentifierInitializerTuple to evaluate
	 */
	public TSCompletion visit(final IdentifierInitializerTuple identifierInitializerTuple)
	{
		//declare the varable
		environment.declareVariable(TSString.create(identifierInitializerTuple.getIdentifier().getName()), false);
		//check if the right hand expression is null, if so, no need to evaluation 
		if (identifierInitializerTuple.getExpression() == null)
		{
			//same completion type as in visit(Identifier) 
			return TSCompletion.createNormal(environment.getIdentifierReference(
					TSString.create(identifierInitializerTuple.getIdentifier().getName())));
		}
		else
		{
			// value to Expression node
			TSCompletion eCompletion = visitNode(identifierInitializerTuple.getExpression());
			// value of Identifier node
			TSCompletion iCompletion = visitNode(identifierInitializerTuple.getIdentifier());
			// return TSCompletion with the identifier equal to the right hand expression 
			return TSCompletion.createNormal(iCompletion.getValue().simpleAssignment(eCompletion.getValue()));
		}
	}
	
	/** Visit the NullLiteral ASTs and evaluate 
	 *  @param nullLiteral  the NullLiteral to evaluate
	 */
	public TSCompletion visit(final NullLiteral nullLiteral)
	{
		return TSCompletion.createNormal(TSNull.value); // TODO: CHECK WITH PROFESSOR
	}
	
	/** Visit the FunctionObject ASTs and evaluate 
	 *  @param functionExpression  the function expression to evaluate
	 */
	public TSCompletion visit(final FunctionExpression functionExpression)
	{
		// case: no identifier 
		if (functionExpression.getIdentifierName() == null)
		{
			TSFunctionObject fo = new TSFunctionObject(environment, functionExpression.getFormalParameters(),
					functionExpression.getFunctionBody());
			return TSCompletion.createNormal(fo);
		}
		// case: identifier
		else
		{
			TSLexicalEnvironment funcEnv = TSLexicalEnvironment.newDeclarativeEnvironment(environment); 
			TSFunctionObject closure = new TSFunctionObject(funcEnv, functionExpression.getFormalParameters(),
					functionExpression.getFunctionBody());
			funcEnv.declareFunctionName(functionExpression.getIdentifierName(), closure);
			return TSCompletion.createNormal(closure);
		}
	}

	/** Visit the PrintStatement ASTs and evaluate 
	 *  @param printStatement  the PrintStatement to evaluate
	 */
	public TSCompletion visit(final PrintStatement printStatement)
	{
		TSCompletion result = visitNode(printStatement.getExp());
		if (!result.isNormal())
		{
			return result;
		} 
		System.out.println(result.getValue().toStr().getInternal());
		return TSCompletion.createNormalNull();
	}

	/** Visit the VarStatement ASTs and evaluate 
	 *  @param varStatement  the VarStatement to evaluate
	 */
	public TSCompletion visit(final VarStatement varStatement)
	{
		// do not make it a configurable binding so it is not deletable
		environment.declareVariable(TSString.create(varStatement.getName()), false);
		return TSCompletion.createNormalNull();
	}

	/** Visit the throw statement AST 
	 *  @param throwStatement  the throw statement to evaluate
	 */
	public TSCompletion visit(final ThrowStatement throwStatement)
	{
		TSValue expValue = visitNode(throwStatement.getExpression()).getValue();
		return TSCompletion.create(TSCompletionType.Throw, expValue.getValue().getValue(), null); 
	}
	
	/** Visit the return statement AST 
	 *  @param returnStatement  the return statement to evaluate
	 */
	public TSCompletion visit(final ReturnStatement returnStatement)
	{
		if (returnStatement.getExpression() == null)
		{
			return TSCompletion.create(TSCompletionType.Return, TSUndefined.value, null);
		}
		else 
		{
			TSValue exprValue = visitNode(returnStatement.getExpression()).getValue();
			return TSCompletion.create(TSCompletionType.Return, exprValue, null);
		}
	}

	/** Visit the call expression AST 
	 *  @param callExpression  the call expression to evaluate
	 */
	public TSCompletion visit(final CallExpression callExpression)
	{
		Expression expression = callExpression.getExpression();
		TSFunctionObject funcObj = null;
		TSValue refVal = visitNode(expression).getValue(); 
		
		// evaluate the arguments and store their values 
		List<Expression> arguments = callExpression.getArguments();
		List<TSValue> argValues = new ArrayList<TSValue>();
		for (Expression expr : arguments) {
			argValues.add(visitNode(expr).getValue().getValue());
		}
		
		//check for build in functions
		if ((refVal instanceof TSPropertyReference) && ( (TSPropertyReference) refVal).getReferencedName().equals(TSString.create("isNaN")))
		{
			TSNumber arg = argValues.get(0).toNumber();
			if (Double.isNaN(arg.getInternal()))
			{
				return TSCompletion.createNormal(TSBoolean.booleanTrue);
			}
			else 
			{
				return TSCompletion.createNormal(TSBoolean.booleanFalse);
			}
		}
		if ((refVal instanceof TSPropertyReference) && ( (TSPropertyReference) refVal).getReferencedName().equals(TSString.create("isFinite")))
		{
			TSNumber arg = argValues.get(0).toNumber();
			if ( Double.isNaN(arg.getInternal()) || Double.isInfinite(arg.getInternal()))
			{
				return TSCompletion.createNormal(TSBoolean.booleanFalse);
			}
			else 
			{
				return TSCompletion.createNormal(TSBoolean.booleanTrue);
			}
		}
		if ((refVal instanceof TSPropertyReference) && ( (TSPropertyReference) refVal).getReferencedName().equals(TSString.create("readln")))
		{
			//scanner = new Scanner(System.in);
			String systemInput = scanner.nextLine();
			//scanner.close();
			if (systemInput.isEmpty())
			{
				systemInput = "";
			} 
			else
			{
				systemInput += "\n";
			}
			return TSCompletion.createNormal(TSString.create(systemInput));
		} 
		if ((refVal instanceof TSPropertyReference) && ( (TSPropertyReference) refVal).getReferencedName().equals(TSString.create("split")))
		{ 	// not up to spec, having issues with property accessors that are numeric, e.g. value.one works, value.1 would not 
			String deliminator = argValues.get(1).toStr().getInternal();
			String input = argValues.get(0).toStr().getInternal(); 
			String[] result = input.split(deliminator);
			TSObject returnResult = new TSObject(); 
			// add a property with the size / count of elements in the object
			returnResult.addProperty(TSString.create("count"), TSNumber.create(result.length));
			for (int i = 0; i < result.length; i++) {
				String string = result[i];
				returnResult.addProperty(TSString.create(Integer.toString(i) ), TSString.create(string));
			}
			return TSCompletion.createNormal(returnResult);
		} 
		
		//check if an object and isCallable
		TSValue exprValue = refVal.getValue();
		if (exprValue instanceof TSObject && exprValue.isCallable() )
		{
			funcObj= (TSFunctionObject) exprValue;
		} 
		else // throw a type error
		{
			return TSCompletion.create(TSCompletionType.Throw, TSString.create("TypeError"), null);
		}
		
		//backup the current lexical environment and set to the function 
		//object's lexical environment 
		TSLexicalEnvironment originalEnvironment = environment;
		environment = TSLexicalEnvironment.newDeclarativeEnvironment(funcObj.getScope());
		List<String> parameters = funcObj.getNames();
		
		//associate the values of the arguments with the parameters in the lexical environment 
		for (int i = 0; i < parameters.size(); i++) {
			environment.declareParameter(parameters.get(i), argValues.get(i));
		}
		//execute each of the statements in the function body, checking for 
		//throw and return values 
		List<SourceElement> se = funcObj.getCode();
		TSCompletion returnValue = TSCompletion.createNormal(TSUndefined.value); 
		for (SourceElement sourceElement : se) {
			returnValue = visitNode(sourceElement); 
			if (returnValue.getType() == TSCompletionType.Throw){
				environment = originalEnvironment; 
				return returnValue; 
			}
			else if (returnValue.getType() == TSCompletionType.Return){
				environment = originalEnvironment; 
				return TSCompletion.createNormal(returnValue.getValue());
			}
		}
		//restore the original lexical environment 
		environment = originalEnvironment; 
		return returnValue; 
	}

	/** Visit the TryStatement ASTs and evaluate 
	 * 
	 */
	public TSCompletion visit(final TryStatement tryStatement)
	{		
		//Let B be the result of evaluating Block.
		TSCompletion b = visitNode(tryStatement.getTryBlock());
		if (b.getType() != TSCompletionType.Throw)
		{
			return b;
		}
		else
		{
			//Let oldEnv be the running execution contexts LexicalEnvironment.
			TSLexicalEnvironment oldEnv = environment;
			//Let catchEnv be the result of calling NewDeclarativeEnvironment passing oldEnv as the argument.
			TSLexicalEnvironment catchEnv = TSLexicalEnvironment.newDeclarativeEnvironment(environment);
			//Call the CreateMutableBinding concrete method of catchEnv passing the Identifier String value as the argument.
			//catchEnv.declareVariable(TSString.create(tryStatement.getCatchIdentifier()), false);
			//commented out the line above because declareParameter already does this step for us in the next line
			//Call the SetMutableBinding concrete method of catchEnv passing the Identifier, C, and false as arguments.
			catchEnv.declareParameter(tryStatement.getCatchIdentifier(), b.getValue().getValue());
			//Set the running execution contexts LexicalEnvironment to catchEnv.
			environment = catchEnv;
			//Let B be the result of evaluating Block.
			b = visitNode(tryStatement.getCatchBlock());
			//Set the running execution contexts LexicalEnvironment to oldEnv.
			environment = oldEnv;
			//Return B.
			return b;
		}	
	}
	
	/** Visit the PropertyAccessor ASTs and evaluate 
	 *  @param propertyAccessor  the property accessor node to evaluate
	 *  
	 *  ECMA 11.2.1
	 *  http://www.ecma-international.org/ecma-262/5.1/#sec-11.2.1
	 *  
	 */
	public TSCompletion visit(final PropertyAccessor propertyAccessor)
	{
		//Let baseReference be the result of evaluating MemberExpression.
		TSCompletion baseReference =  visitNode(propertyAccessor.getExpression());
		//Let baseValue be GetValue(baseReference).
		TSValue baseValue = baseReference.getValue().getValue();
		
		/* ONLY NEEDED FOR MemberExpression [ Expression ] notation */
		//Let propertyNameReference be the result of evaluating Expression.
		//Let propertyNameValue be GetValue(propertyNameReference).
		
		//Call CheckObjectCoercible(baseValue).
		if (!checkObjectCoercible(baseValue)){
			// throw a type error message string
			return TSCompletion.create(TSCompletionType.Throw, TSString.create("TypeError"), null);
		}
		
		//Let propertyNameString be ToString(propertyNameValue).
		//If the syntactic production that is being evaluated is contained in strict mode code, let strict be true, else let strict be false.
		
		//Return a value of type Reference whose base value is baseValue and whose referenced name is propertyNameString, and whose strict mode flag is strict.
		 TSReference returnValue = new TSPropertyReference((TSObject)baseValue, TSString.create(propertyAccessor.getIdentifierName())); 
		 return TSCompletion.createNormal(returnValue);
	}
	
	/** Visit the PropertyAccessor ASTs and evaluate 
	 *  @param propertyAccessorBracket  the property accessor node to evaluate
	 *  
	 *  ECMA 11.2.1
	 *  http://www.ecma-international.org/ecma-262/5.1/#sec-11.2.1
	 *  
	 */
	public TSCompletion visit(final PropertyAccessorBracket propertyAccessorBracket)
	{
		//Let baseReference be the result of evaluating MemberExpression.
		TSCompletion baseReference =  visitNode(propertyAccessorBracket.getExpression());
		//Let baseValue be GetValue(baseReference).
		TSValue baseValue = baseReference.getValue().getValue();
		
		/* ONLY NEEDED FOR MemberExpression [ Expression ] notation */
		//Let propertyNameReference be the result of evaluating Expression.
		TSCompletion propertyNameReference = visitNode(propertyAccessorBracket.getInnerExpression());
		//Let propertyNameValue be GetValue(propertyNameReference).
		TSValue propertyNameValue = propertyNameReference.getValue(); 
		
		//Call CheckObjectCoercible(baseValue).
		if (!checkObjectCoercible(baseValue)) {
			// throw a type error message string
			return TSCompletion.create(TSCompletionType.Throw, TSString.create("TypeError"), null);
		}
		
		//Let propertyNameString be ToString(propertyNameValue).
		//If the syntactic production that is being evaluated is contained in strict mode code, let strict be true, else let strict be false.
		TSString propertyNameString = propertyNameValue.toStr(); 
		
		//Return a value of type Reference whose base value is baseValue and whose referenced name is propertyNameString, and whose strict mode flag is strict.
		 TSReference returnValue = new TSPropertyReference((TSObject)baseValue, propertyNameString); 
		 return TSCompletion.createNormal(returnValue);
	}
	
	
	/** checkObjectCoercible checks if the value can be converted to an Object
	 *  http://www.ecma-international.org/ecma-262/5.1/#sec-9.10
	 * @param value value to check 
	 * @return true if convertable to object, false otherwise 
	 */
	public boolean checkObjectCoercible(TSValue value)
	{
		if (value instanceof TSUndefined || value instanceof TSNull) 
		{
			return false;
		}
		else 
		{
			return true; 
		}
	}
	
	/** Visit the NewExpression ASTs and evaluate 
	 *  @param newExpression  the expression to evaluate
	 *  http://www.ecma-international.org/ecma-262/5.1/#sec-11.2.2
	 */
	public TSCompletion visit(final NewExpression newExpression)
	{
		//Let ref be the result of evaluating NewExpression.
		TSValue ref = visitNode(newExpression.getExp()).getValue(); 
		//Let constructor be GetValue(ref).
		TSValue constructor = ref.getValue();
		//If Type(constructor) is not Object, throw a TypeError exception.
		if (!(constructor instanceof TSObject))
		{
			return TSCompletion.create(TSCompletionType.Throw, TSString.create("TypeError"), null);
		}
		//If constructor does not implement the [[Construct]] internal method, throw a TypeError exception.
		
		//Return the result of calling the [[Construct]] internal method on constructor, providing no arguments (that is, an empty list of arguments).
		//TSObject t = TSObject.create(); 
		
		return TSCompletion.createNormal((TSObject)constructor);
	}
	
	/** Visit the This expression
	 * 
	 */
	public TSCompletion visit(final This thisExpression)
	{
		return TSCompletion.createNormal(thisObject);
	}
	
}

