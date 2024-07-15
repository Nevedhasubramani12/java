//18.Word length

import java.util.Scanner;

public class WordLengthCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();          

       
        String[] words = input.split("\\s+");
        
        
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word + " - Even");
            } else {
                System.out.println(word + " - Odd");
            }
        }
        
        scanner.close();
    }
}
