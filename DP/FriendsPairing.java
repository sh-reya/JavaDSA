class Solution
{
    public long countFriendsPairings(int n) 
    { 
        int mod=1000000007;
        long table[]=new long[n+1];
        for(int i=0; i<=n; i++)
        {
            if(i<=2)
            {
                table[i]=i;
            }
            
            else
            {
                table[i]=Math.abs((table[i-1]+(i-1)*table[i-2])%mod);
            }
        }
        
        return table[n];
       //code here
    }
}  
