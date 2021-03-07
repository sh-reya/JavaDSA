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
