package JavaOOPadvanced._6;

public enum Operator {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;


    public int operatorMat (int num1, int num2, Operator operator) {
        switch (operator) {
            case ADD:
                return num1 + num2;
            case SUBTRACT:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
                if (num2 == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator.");
        }
    }

}




