import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    //int n=System.int();
	    int result=sq(n);
		System.out.println(result);
	}
	static int sq(int n)
	{
	    if(n<0)
	    {
	        n = -n;
	    }
	    if(n==0)
	    {
	        return 0;
	    }
	    int flr=n>>1;
	    if(n%2!=0)
	    {
	        return((sq(flr)<<2)+(flr<<2)+1);
	    }
	    else{
	        return (sq(flr)<<2);
	    }
	}
}
