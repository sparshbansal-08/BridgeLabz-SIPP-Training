import java.util.Scanner;

public class CharacterCount {
    static int countCharacters(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = countCharacters(str);
        System.out.println("Character count: " + count);
    }
}