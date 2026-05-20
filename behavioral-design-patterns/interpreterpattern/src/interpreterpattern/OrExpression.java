package interpreterpattern;

// Non-Terminal Expression
public class OrExpression implements Expression {

    private final Expression leftExpression;

    private final Expression rightExpression;

    public OrExpression(
            Expression leftExpression,
            Expression rightExpression
    ) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret(String context) {

        return leftExpression.interpret(context)
                || rightExpression.interpret(context);
    }
}