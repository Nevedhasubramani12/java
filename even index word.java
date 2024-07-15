
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   String str=s.nextLine();
	   String a[]=str.split(" ");
	   int n=a.length;
	   for(int i=0;i<n;i++)
	   {
	       int n1=0;
	        n1=a[i].length();
	       if(n1%2==0)
	       {
	           System.out.println(a[i]+"-"+n1);
	       }
	   }
	}
}
