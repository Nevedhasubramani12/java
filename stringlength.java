
    
import java.util.Scanner;

public class stringlength {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        String[] words=str.split(" ");
        for(String word: words)
        {
            int length=word.length();
            System.out.println(word+" "+length);
        }
        for(String word: words){
            int length=word.length();
            if(length%2==0)
            {
                System.out.println(word + " ");
            }
        }
    }
}

