import java.util.Scanner;

public class SubstringCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String sub = str.substring(start, end);
        System.out.println("Substring: " + sub);
        System.out.println("First char of substring: " + sub.charAt(0));
    }
}