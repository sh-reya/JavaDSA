class Solution
{
    static int nCr(int n, int r)
    {
        
        int table[]=new int [r+1];
        table[0]=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=Math.min(i,r); j>0; j--)
            {
                table[j]=(int)((table[j]+table[j-1])%(Math.pow(10,9)+7));
            }
        }
        return table[r];
        // code here
    }
}
