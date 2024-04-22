package tjdpc;

public class ClientStrategy {
    public static void main(String[] args) {
        ContextStrategy context = new ContextStrategy();

        int result = context.executeStrategy(new OperationAdd(), 10, 5);

        System.out.println("10 + 5 = " + result);

        result = context.executeStrategy(new OperationSubtract(), 10, 5);

        System.out.println("10 - 5 = " + result);

        result = context.executeStrategy(new OperationMultiply(), 10, 5);

        System.out.println("10 * 5 = " + result);
    }
}