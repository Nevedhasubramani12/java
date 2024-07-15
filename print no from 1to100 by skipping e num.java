
//5. Print numbers backwards from 100 to 1 by skipping 2 numbers

public class PrintNumbersBackwardsSkipping {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i -= 3) {
            System.out.print(i + " ");
        }
    }
}
