import java.util.Scanner;

public class PowerOfNumberUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int result = 1;
        int counter = 0;

        while (counter != power) {
            result = result * number;
            counter = counter + 1;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
