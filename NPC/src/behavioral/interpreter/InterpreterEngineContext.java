package behavioral.interpreter;

public class InterpreterEngineContext {

    public int add(String input) {
        String[] tokens = this.interpret(input);
        int firstNumber = Integer.parseInt(tokens[0]);
        int secondNumber = Integer.parseInt(tokens[1]);
        return firstNumber + secondNumber;
    }

    public int subtract(String input) {
        String[] tokens = this.interpret(input);
        int firstNumber = Integer.parseInt(tokens[0]);
        int secondNumber = Integer.parseInt(tokens[1]);

        return firstNumber - secondNumber;
    }

    private String[] interpret(String input) {
        String str = input.replaceAll("[^0-9]", " ");
        str = str.replaceAll("( )+", " ").trim();
        return str.split(" ");
    }
}
