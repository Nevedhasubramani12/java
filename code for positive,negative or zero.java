//1.Positive ,negative or zero:

import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        if (N > 0) {
            System.out.println(N + " is positive.");
        } else if (N < 0) {
            System.out.println(N + " is negative.");
        } else {
            System.out.println(N + " is zero.");
        }
    }
}
