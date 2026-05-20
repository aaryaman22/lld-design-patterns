package interpreterpattern;

// Non-Terminal Expression
public class AndExpression implements Expression {

    private final Expression leftExpression;

    private final Expression rightExpression;

    public AndExpression(
            Expression leftExpression,
            Expression rightExpression
    ) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret(String context) {

        return leftExpression.interpret(context)
                && rightExpression.interpret(context);
    }
}