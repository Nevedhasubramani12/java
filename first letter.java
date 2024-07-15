
import java.util.Scanner;

public class FirstLetter{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(s.charAt(0)+" ");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                System.out.print(s.charAt(i+1)+" ");
            }
        }
    }
}
