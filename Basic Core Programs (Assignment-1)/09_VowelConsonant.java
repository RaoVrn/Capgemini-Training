import java.util.*;

public class VowelConsonant {

    // Function to check if the character is a vowel or consonant
    public static void checkVowelOrConsonant(char ch) {

        // Convert to lowercase for easier comparison
        char c = Character.toLowerCase(ch);

        // Check if the character is alphabetic
        if (!Character.isLetter(c)) {
            System.out.println("Error: Please enter a valid alphabet.");
            return;
        }

        // Check for vowels
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(ch + " is a Vowel");
        } 
        // Otherwise it is a consonant
        else {
            System.out.println(ch + " is a Consonant");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);  // Take single character input

        checkVowelOrConsonant(ch);
    }
}
