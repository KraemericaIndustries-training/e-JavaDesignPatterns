package tjdpc;

public interface Expression {
    public boolean interpret(ContextInterpreter context);
}

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(ContextInterpreter context) {
        return context.getResult(data);
    }
}