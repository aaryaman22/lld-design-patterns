package interpreterpattern;

// Abstract Expression
public interface Expression {

    boolean interpret(String context);
}