class Calculator {

    int calculate (String line) throws CalculationException {
        String[] mathSigh = line.split(" ");
        int a = Integer.parseInt(mathSigh[0]);
        String operator = mathSigh[1];
        int b = Integer.parseInt(mathSigh[2]);
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default: throw new  CalculationException("Неверный математический оператор");
        }
    }

    boolean checkInput (String input) throws CalculationException {
        if (input.isEmpty()) {
            throw new CalculationException("Введена пустая строка");
        }
        String[] mathSigh = input.split(" ");
        if (mathSigh.length != 3) {
            throw new CalculationException("Неверный формат примера");
        }
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(mathSigh[0]);
            b = Integer.parseInt(mathSigh[2]);
        } catch (NumberFormatException e) {
            throw new CalculationException("Введено не целое число");
        }
        if (a > 10 || a < 1 || b > 10 || b < 1) {
            throw new CalculationException("Числа выходят за допустимый диапазон");
        }
        return true;
    }
}
