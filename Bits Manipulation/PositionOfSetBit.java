class Solution 
{
    static int findPosition(int N) 
    {
        int bits=setBits(N);
        if(bits!=1)
        {
            return -1;
        }
        else
        {
            return (int)(Math.log(N)/Math.log(2))+1;
        }
        
        
    }
   
    
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
