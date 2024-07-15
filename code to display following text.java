//Develop a code to display the following pattern

public class StringPattern {
    public static void main(String[] args) {
             String input = "ALPHA";
        
                displayPattern(input);
    }

    public static void displayPattern(String str) {
        
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
    }
}
