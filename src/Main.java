import java.util.Scanner;

public class Main {
    public static String calc(String input) throws CalculationException {
        Calculator calculator = new Calculator();
        if (calculator.checkInput(input)) {
            int answer = calculator.calculate(input);
            return Integer.toString(answer);
        } else {
            throw new  CalculationException("Произошла ошибка");
        }

    }

    public static void main(String[] args) throws CalculationException {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            System.out.println(calc(input));
        }
    }
}