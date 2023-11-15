import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\tДобро пожаловать в калькулятор!!!\n\n");
        System.out.println("Введите знак для операции (произведение: *, частное: /, сумма: +, разность: - ): ");

        // В данном случае пользуюсь string, чтобы обозначить ввод в консоли какого либа знака взаимойдействия с числами
        String symbol = new Scanner(System.in).next();

        System.out.println("Введите первое число: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число: ");
        double b = new Scanner(System.in).nextDouble();

        // Пришлось узнавать в интернете, как создавать условия. Equal сравнивает объект на равенство с введеным, работает только со String
        if (symbol.equals("*")) {
            System.out.println(a + " * " + b + " = " + (a * b));
        }
        else if (symbol.equals("/")) {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
        else if (symbol.equals("+")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        }
        else if (symbol.equals("-")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        }
        else {
            System.out.println("Неверный символ операции, выберите одно из предложенных");
        }
    }
}
