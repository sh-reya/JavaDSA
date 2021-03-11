class Solution
{
    
    static int nCr(int n, int r)
    {
        int table[][] = new int[n+1][r+1];
        for(int i=0; i<=n ; i++)
        {
            for(int j=0; j<=Math.min(i,r); j++)
            {
                if( j == 0 || i == j )
                {
                    table[i][j] = 1;
                } 
                else {
                    table[i][j] = (int)(( (long)table[i-1][j-1] + (long)table[i-1][j] ) % ((Math.pow(10,9))+7));
                }
            }
        }
        return table[n][r];
    }
    
}
