
//7.Develop a code to display the following pattern

public class SymbolPattern {
    public static void main(String[] args) {
        // Array of symbols to be printed
        char[] symbols = {'@', '?', '>'};

        // Loop through each symbol in the array
        for (char symbol : symbols) {
            // Print each symbol 3 times
            for (int j = 0; j < 3; j++) {
                System.out.print(symbol + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
