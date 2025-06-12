import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double number1, number2;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;


        System.out.printf(
                "The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f and %.2f",
                number1, number2, addition, subtraction, multiplication, division
        );

        input.close();
    }
}
