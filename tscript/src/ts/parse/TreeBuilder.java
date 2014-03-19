package ts.parse;

import java.util.List;
import ts.Location;
import ts.Message;
import ts.tree.*;

/**
 * Provides static methods for building AST nodes
 */
public class TreeBuilder
{

	/** Build a "var" statement.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  name name of variable being declared.
	 */
	public static Statement buildVarStatement(final Location loc,
			final String name)
	{
		Message.log("TreeBuilder: VarStatement");
		return new VarStatement(loc, name);
	}

	/** Build a expression statement.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  exp  expression subtree
	 */
	public static Statement buildExpressionStatement(final Location loc,
			final Expression exp)
	{
		Message.log("TreeBuilder: ExpressionStatement");
		return new ExpressionStatement(loc, exp);
	}

	/** Build an empty statement.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 */
	public static Statement buildEmptyStatement(final Location loc)
	{
		Message.log("TreeBuilder: EmptyStatement");
		return new EmptyStatement(loc);
	}

	/** Build a binary operator.
	 *
	 *  @param  loc   location in source code (file, line, column)
	 *  @param  op    the binary operator
	 *  @param  left  the left subtree
	 *  @param  right the right subtree
      @see Binop
	 */
	public static Expression buildBinaryOperator(final Location loc,
			final Binop op,
			final Expression left, final Expression right)
	{
		Message.log("TreeBuilder: Binop " + op.toString());
		return new BinaryOperator(loc, op, left, right);
	}

	/** Build a unary operator.
	 *
	 *  @param  loc   location in source code (file, line, column)
	 *  @param  op    the unary operator
	 *  @param  child the child subtree
      @see Unary
	 */
	public static Expression buildUnaryOperator(final Location loc,
			final Unary op,
			final Expression child)
	{
		Message.log("TreeBuilder: Unary " + op.toString());
		return new UnaryOperator(loc, op, child);
	}

	/** Build a identifier expression.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  name name of the identifier.
	 */
	public static Expression buildIdentifier(final Location loc,
			final String name)
	{
		Message.log("TreeBuilder: Identifier (" + name + ")");
		return new Identifier(loc, name);
	}

	/** Build a numeric literal expression. Converts the String for
	 *  the value to a double.
	 *
	 *  @param  loc   location in source code (file, line, column)
	 *  @param  value value of the literal as a String
	 */
	public static Expression buildNumericLiteral(final Location loc,
			final String value)
	{
		double d = 0.0;

		try
		{
			d = Double.parseDouble(value);
		}
		catch(NumberFormatException nfe)
		{
			
			try 
			{
				Integer i = Integer.parseInt(value.substring(2), 16);
				d = i.doubleValue(); 
			} 
			catch (Exception e) {
				// TODO: handle exception
				Message.bug(loc, "numeric literal not parsable");
			}
		}
		Message.log("TreeBuilder: NumericLiteral " + d);
		return new NumericLiteral(loc, d);
	}

    /** Build a string literal expression. Converts the String for
     *  the value to a double.
     *
     *  @param  loc   location in source code (file, line, column)
     *  @param  value value of the literal as a String
     */
    public static Expression buildStringLiteral(final Location loc,
            final String value)
    {
        String s = "";

        try
        {
            s = value.substring(1, value.length() - 1); // TODO: CHECK IF THIS WORKS WITH EMPTY STRING
            s = s.replaceAll("\\\\n", "\n");
        }
        catch(Exception e)
        {
            Message.bug(loc, "string literal not parsable");
        }
        Message.log("TreeBuilder: StringLiteral " + s);
        return new StringLiteral(loc, s);
    }

	/** Build a boolean literal expression. Converts the String for
	 *  the value to a boolean.
	 *
	 *  @param  loc   location in source code (file, line, column)
	 *  @param  value value of the literal as a String
	 */
	public static Expression buildBooleanLiteral(final Location loc,
			final String value)
	{
		Boolean b = false;  // TODO: Boolean or boolean here? 

		try
		{
			b = Boolean.parseBoolean(value);
		}
		catch(NumberFormatException nfe) // TODO: Is this the correct exception 
		{
			Message.bug(loc, "boolean literal not parsable");
		}
		Message.log("TreeBuilder: BooleanLiteral " + b);
		return new BooleanLiteral(loc, b);
	}


	/** Build a function expression.
	 *
	 *  @param  loc   location in source code (file, line, column)
	 */
	public static Expression buildFunctionExpression(final Location loc,
			final String ident, List<String> parameters, List<SourceElement> body)
	{
		
		Message.log("TreeBuilder: FunctionExpression");
		return new FunctionExpression(loc, ident, parameters, body);
	}

	/** Build a null literal expression. 
	 *
	 *  @param  loc   location in source code (file, line, column)
	 */
	public static Expression buildNullLiteral(final Location loc)
	{
		Message.log("TreeBuilder: NullLiteral");
		return new NullLiteral(loc);
	}

	/** Build a VariableDeclarationList. 
	 *
	 *  @param  loc   location in source code (file, line, column)
	 *  @param  value list of IdentifierInitializerTuple
	 */
	public static VariableDeclarationList buildVariableDeclarationList(final Location loc,
			final List<IdentifierInitializerTuple> value)
	{
		Message.log("TreeBuilder: VariableDeclarationList");
		return new VariableDeclarationList(loc, value);
	}
	
	/** Build a IdentifierInitializerTuple. 
	 *
	 *  @param  loc   location in source code (file, line, column)
	 *  @param  identifier the identifier 
	 *  @param 	expr  the expression to be evaluated 
	 */
	public static IdentifierInitializerTuple buildIdentifierInitializerTuple(final Location loc,
			final String identifier, final Expression expr)
	{
		Message.log("TreeBuilder: IdentifierInitializerTuple");
		return new IdentifierInitializerTuple(loc, identifier, expr);
	}

	/** Build a block statement.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  sl   an optional statement list.
	 */
	public static Statement buildBlockStatement(final Location loc,
			final List<Statement> sl)
	{
		Message.log("TreeBuilder: BlockStatement");
		return new BlockStatement(loc, sl);
	}

	/** Build an if / else statement.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  e    the boolean if expression to be evaluated.
	 *  @param	s1	 the statement returned if e is true
	 *  @param  s2   the statement returned if e is false
	 */
	public static Statement buildIfStatement(final Location loc,
			final Expression e, final Statement s1, final Statement s2)
	{
		Message.log("TreeBuilder: IfStatement");
		return new IfStatement(loc, e, s1, s2);
	}

	/** Build a while statement.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  e    the boolean expression to be evaluated.
	 *  @param	s	 the statement evaluated if e is true
	 */
	public static Statement buildWhileStatement(final Location loc,
			final Expression e, final Statement s)
	{
		Message.log("TreeBuilder: WhileStatement");
		return new WhileStatement(loc, e, s);
	}

	/** Build a break statement.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  ident the identifier 
	 */
	public static Statement buildBreakStatement(final Location loc,
			final String ident)
	{
		Message.log("TreeBuilder: BreakStatement");
		return new BreakStatement(loc, ident);
	}

	/** Build a continue statement.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  ident the identifier 
	 */
	public static Statement buildContinueStatement(final Location loc,
			final String ident)
	{
		Message.log("TreeBuilder: ContinueStatement");
		return new ContinueStatement(loc, ident);
	}

	/** Build a labelled statement.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  i 	the identifier 
	 *  @param	s 	the statement
	 */
	public static Statement buildLabelledStatement(final Location loc,
			final String i, final Statement s)
	{
		Message.log("TreeBuilder: LabelledStatement");
		return new LabelledStatement(loc, i, s);
	}

	/** Build a print statement.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  exp  expression subtree.
	 */
	public static Statement buildPrintStatement(final Location loc,
			final Expression exp)
	{
		Message.log("TreeBuilder: PrintStatement");
		return new PrintStatement(loc, exp);
	}



	public static Expression buildCallExpression(final Location loc,
			final Expression expr, final List<Expression> args)
	{
		Message.log("TreeBuilder: CallExpression");
		return new CallExpression(loc, expr, args);
	}

	public static Statement buildReturnStatement(final Location loc,
			final Expression expr)
	{
		Message.log("TreeBuilder: ReturnStatement");
		return new ReturnStatement(loc, expr);
	}


	//
	// methods to detect "early" (i.e. semantic) errors
	//

	// helper function to detect "reference expected" errors
	private static boolean producesReference(Node node)
	{
		if (node instanceof Identifier)
		{
			return true;
		}
		return false;
	}

	/** Used to detect non-references on left-hand-side of assignment.
	 *
	 *  @param  loc  location in source code (file, line, column)
	 *  @param  node tree to be checked
	 */
	public static void checkAssignmentDestination(Location loc, Node node)
	{
		if (!producesReference(node))
		{
			Message.error(loc, "assignment destination must be a Reference");
		}
	}

}
