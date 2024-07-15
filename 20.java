//20.Remove the duplicates

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();  
        
        
        String[] words = input.split("\\s+");
        
        
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        
        
        System.out.println("Words after removing duplicates:");
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
        
        scanner.close();
    }
}
