import java.util.Scanner;

public class UniversityDiscountCalculator {
    public static void main(String[] args) {
        double fee, discountPercent;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course fee (INR): ");
        fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);

        input.close();
    }
}
