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
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b)
    {
        int count=0;
        int XOR=(a^b);
        while(XOR>0)
        {
            count+=XOR&1;
            XOR=XOR/2;
        }
        
        return count;
    }
 
}
