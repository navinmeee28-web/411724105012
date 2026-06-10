import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Vowel count: " + vowel);
        System.out.println("Consonant count: " + consonant);

        sc.close();
    }
}