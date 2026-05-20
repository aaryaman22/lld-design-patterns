package interpreterpattern;

// Terminal Expression
public class TerminalExpression implements Expression {

    private final String word;

    public TerminalExpression(String word) {
        this.word = word;
    }

    @Override
    public boolean interpret(String context) {

        return context.contains(word);
    }
}