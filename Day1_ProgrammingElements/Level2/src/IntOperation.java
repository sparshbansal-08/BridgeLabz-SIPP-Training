package BestProgrammingPractice.Level2PracticePrograms;

import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}
