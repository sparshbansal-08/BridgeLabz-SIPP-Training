import java.util.Scanner;

public class LowerCaseCompare {

    static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String customLower = convertToLower(input);
        String builtInLower = input.toLowerCase();
        boolean isSame = compareStrings(customLower, builtInLower);
        System.out.println("Converted Text: " + customLower);
        System.out.println("Comparison Result: " + isSame);
    }
}