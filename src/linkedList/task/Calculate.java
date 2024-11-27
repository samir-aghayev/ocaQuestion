package linkedList.task;

public final class Calculate<T extends Number> {
    private final T num1;
    private final T num2;
    private final char operation;

    public Calculate(T num1, T num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public T calculate() {
        return switch (operation) {
            case '+' -> (T) (Double.valueOf(num1.doubleValue() + num2.doubleValue()));
            case '-' -> (T) (Double.valueOf(num1.doubleValue() - num2.doubleValue()));
            case '*' -> (T) (Double.valueOf(num1.doubleValue() * num2.doubleValue()));
            case '/' -> (T) (Double.valueOf(num1.doubleValue() / num2.doubleValue()));
            default -> {
                System.out.println(operation + " is not valid operation ");
                yield null;
            }
        };
    }
}
