package behavioral.interpreter;

public class Main {

    public static void main(String[] args) {
        System.out.println("10 + 10 = " + interpret("10 + 10", ExpressionType.ADD));
        System.out.println("21 - 10 = " + interpret("21 - 10", ExpressionType.SUBTRACT));
    }

    private static int interpret(String input, ExpressionType type) {
        Expression expression = null;
        if (ExpressionType.ADD.equals(type)) {
            expression = new AddExpression(input);
        } else {
            expression = new SubtractExpression(input);
        }
        return expression.interpret(new InterpreterEngineContext());
    }
}
