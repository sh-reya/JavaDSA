class Solution
{
    long countWays(int n,int k)
    {
        long table[]=new long[n+1];
        Arrays.fill(table,0);
        long mod=1000000007;
        if(n==0)
        {
            return 0;
        }
        table[1]=k;
        long same=0;
        long diff=k;
        
        for(int i=2; i<=n; i++)
        {
            same=diff;
            diff=(table[i-1]*(k-1));
            table[i]=(same+diff)%mod;
        }
        
        return table[n];
        //code here.
    }
}
