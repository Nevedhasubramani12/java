//3. To accept a number N and print whether the number is EVEN or ODD

import java.util.Scanner;
public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            System.out.println(N + " is EVEN.");
        } else {
            System.out.println(N + " is ODD.");
        }
    }
}
