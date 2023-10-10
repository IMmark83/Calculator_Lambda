import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);             // результат: 3
        int b = calc.minus.apply(1, 1);            // результат: 0

        int c = 0;
        try {
            c = calc.devide.apply(a, b); // при проведении операции выбрасывает ошибку ArithmeticException
            //  т.к. деление на '0' не возможно.
            //  Решение - поместить код, в котором возможна ошибка, в блок "try" и
            //  обработать его в блоке "catch". В методе "devide" добавить проверку делителя на соответствие '0'.
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! На ноль делить нельзя!");
        } finally {
            calc.println.accept(c);
        }
    }
}

