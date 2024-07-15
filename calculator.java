//calculator
package Calculator;
public class Calc {
    public int add(int a,int b)
    {
    	return a+b;
    }
    public int sub(int a,int b)
    {
    	return a-b;
    }
    public int product(int a,int b)
    {
    	return a*b;
    }
    public int division(int a,int b)
    {
    	return a/b;
    }
}

package com.kart;
import Calculator.Calc;


public class CalcGenerate {
  public static void main(String args[])
  {
	  Calc c=new Calc();
	  System.out.println(c.add(4,7));
	  System.out.println(c.sub(8, 6));
	  System.out.println(c.product(8, 6));
	  System.out.println(c.division(10,5));
	  
  }
}
