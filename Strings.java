import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

       
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);

        
        int length = inputString.length();
        System.out.println("Length: " + length);

        
        String replacedString = inputString.replace('a', 'z');
        System.out.println("Replaced String: " + replacedString);

        
        String substring = inputString.substring(2, 5);
        System.out.println("Substring (from index 2 to 5): " + substring);
    }
    
}
