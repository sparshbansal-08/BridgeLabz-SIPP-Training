import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        double distanceInFeet;

        Scanner input = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Convert feet to yards and miles
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        // Output results
        System.out.printf("The distance %.2f feet is equal to %.2f yards and %.4f miles.\n", distanceInFeet, yards, miles);

        input.close();
    }
}
