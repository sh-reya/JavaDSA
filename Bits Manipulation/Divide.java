import java.io.*;
import java.util.*;
class GFG 
{
	public static void main (String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int dividend=s.nextInt();
	    int divisor=s.nextInt();
	    int Final_Ans=fun(dividend,divisor);
	    System.out.print(Final_Ans);
	}
	
	static int fun(int dividend, int divisor)
	{
	    int sign=(dividend<1)^(divisor<1)?-1:1;
	    
	    dividend=Math.abs(dividend);
	    divisor=Math.abs(divisor);
	    int quo=0;
	    while(dividend>=divisor)
	    {
	        dividend=dividend-divisor;
	        ++quo;
	    }
	    return sign*quo;
	}
}
