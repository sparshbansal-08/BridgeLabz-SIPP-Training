import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        double base, height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        height = input.nextDouble();

        double areaInInches = 0.5 * base * height;


        double areaInCm = areaInInches * 6.4516;


        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters.\n", areaInInches, areaInCm);

        input.close();
    }
}
