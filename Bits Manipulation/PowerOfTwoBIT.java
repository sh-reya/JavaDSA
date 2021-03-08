class Solution
{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n)
    {
       long bits=setBits(n);
       if(bits==1)
       {
           return true;
       }
       else
       {
           return false;
       }
        
        // Your code here
        
    }
    
    static long setBits(long N) 
    {
       if(N==0)
       {
           return 0;
       }
       else
       {
           return (N&1)+setBits(N>>1);
       }
    }
    
}
