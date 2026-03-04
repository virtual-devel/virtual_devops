import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give number 1: ");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Give operator (+, -, *, /): ");
        String operator = sc.nextLine();

        System.out.print("Give number 2: ");
        double num2 = Double.parseDouble(sc.nextLine());

        double result;

        switch(operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    break;
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;
                }
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}