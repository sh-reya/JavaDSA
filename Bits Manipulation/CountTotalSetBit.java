class Solution
{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int power=powerof(n);
        int Bit_Count_till_2power=power*(1<<power-1);
        int Bit_Count_MSB=n-(1<<power)+1;
        int Bacha_hua=n-(1<<power);
        int ans=Bit_Count_till_2power+Bit_Count_MSB+countSetBits(Bacha_hua);
        return ans;
    
        // Your code here
        
    }
    
    public static int powerof(int n)
    {
        int power=0;
        while((1<<power) <= n)
        {
            power++;
        }
        return power-1; 
    }
}
