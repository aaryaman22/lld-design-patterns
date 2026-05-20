package interpreterpattern;

// Client
public class InterpreterDemo {

    public static void main(String[] args) {

        System.out.println("\n###### Interpreter Design Pattern ######");

        // Terminal Expressions
        Expression java =
                new TerminalExpression("Java");

        Expression spring =
                new TerminalExpression("Spring");

        Expression docker =
                new TerminalExpression("Docker");

        // Java AND Spring
        Expression javaAndSpring =
                new AndExpression(java, spring);

        // (Java AND Spring) OR Docker
        Expression finalExpression =
                new OrExpression(javaAndSpring, docker);

        // Test Strings
        String candidate1 =
                "Java Spring Boot Developer";

        String candidate2 =
                "Docker Kubernetes Engineer";

        String candidate3 =
                "React Frontend Developer";

        System.out.println(
                candidate1 + " => "
                        + finalExpression.interpret(candidate1)
        );

        System.out.println(
                candidate2 + " => "
                        + finalExpression.interpret(candidate2)
        );

        System.out.println(
                candidate3 + " => "
                        + finalExpression.interpret(candidate3)
        );
    }
}