/* 
class Solution
{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b)
    {
        return Integer.bitCount(a^b);
    }
 
}
It works! */

class Solution 
{
    static int setBits(int N) 
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
