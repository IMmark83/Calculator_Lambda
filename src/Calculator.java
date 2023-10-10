import java.util.function.*;

class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    Consumer<Integer> println = x -> System.out.printf("Ты заработал: " + "%d тенге, брат! \n", x);
    Predicate<Integer> isPositive = x -> x > 0;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> (y == 0) ? 0 : (x / y);


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

}
