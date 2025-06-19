import java.util.Scanner;

public class StringCompareCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean result = str1.charAt(0) == str2.charAt(0);
        System.out.println("charAt() compare: " + result);
        boolean equals = str1.equals(str2);
        System.out.println("equals(): " + equals);
    }
}