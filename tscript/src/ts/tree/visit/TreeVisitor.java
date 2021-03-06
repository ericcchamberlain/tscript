
package ts.tree.visit;

import ts.tree.*;

/**
 * All visitor classes for ASTs will implement this interface, which
 *   is parameterized by return type.
 *
 */
public interface TreeVisitor<T>
{
  T visit(BinaryOperator binaryOperator);

  T visit(ExpressionStatement expressionStatement);

  T visit(Identifier identifier);

  T visit(NumericLiteral numericLiteral);

  T visit(BooleanLiteral booleanLiteral);
  
  T visit(PrintStatement printStatement);

  T visit(UnaryOperator unaryOperator);

  T visit(VarStatement varStatement);

  T visit(NullLiteral nullLiteral);

  T visit(StringLiteral stringLiteral);
  
  T visit(VariableDeclarationList variableDeclarationList);
  
  T visit(IdentifierInitializerTuple identifierInitializerTuple);
  
  T visit(EmptyStatement empytStatement);

  T visit(BlockStatement blockStatement);

  T visit(IfStatement ifStatement);

  T visit(WhileStatement whileStatement);

  T visit(BreakStatement breakStatement);

  T visit(ContinueStatement continueStatement);
  
  T visit(LabelledStatement labelledStatement);

  T visit(FunctionExpression functionExpression);

  T visit(CallExpression callExpression);

  T visit(ReturnStatement returnStatement);

  T visit(ThrowStatement throwStatement);

  T visit(TryStatement tryStatement);

  T visit(PropertyAccessor propertyAccessor);

  T visit(NewExpression newExpression);

  T visit(This thisExpression);

  T visit(PropertyAccessorBracket propertyAccessorBracket);

}

