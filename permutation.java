import java.util.*;
public class Ipaddressfindclass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String []s2=s1.split("\\.");
        boolean flag=false;
        if(s2.length<=4){
        for(int i=0;i<s2.length;i++){
          int n=Integer.parseInt(s2[i]);
          
          if(n > 0&&n<=255){
              flag=true;
              
          }else{
             flag=false;
          }
        }
        if(flag){
            System.out.println("Ip address is valid");
        }else{
            System.out.println("Ip address is not valid");
        }
         for(int i=0;i<s2.length;i++){
          int n=Integer.parseInt(s2[i]);
          if(n>0 && 127>n){
              System.out.println("class A");
              break;
          }else if(n>128&&191>n){
               System.out.println("class B");
               break;
          }else if(n>192&&223>n){
               System.out.println("class C");
               break;
          }else if(n>224&&239>n){
               System.out.println("class D");
               break;
          }else if(n>240&&255>n){
               System.out.println("class E");
               break;
          }
         }
        }else{
            System.out.println("ip address is not valid");
        }
        }
    }
