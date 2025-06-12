import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        double perimeter;

        Scanner input = new Scanner(System.in);

        // Input perimeter from user
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Output result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f", side, perimeter);

        input.close();
    }
}
