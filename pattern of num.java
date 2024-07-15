//12.Pattern of number:

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        scanner.close();
        
       
        for (int i = 0; i < n; i++) {
           
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            
            System.out.println();
        }
    }
}
