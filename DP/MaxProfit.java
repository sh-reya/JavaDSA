class Solution 
{
    static int maxProfit(int K, int N, int A[]) 
    {
        int table[][]=new int [K+1][N+1];
        //k=chances, n=elements.
        
        //if 0 elements, profit=0;
        for(int i=0; i<K; i++)
        {
            table[i][0]=0;
        }
        
        //if 0 chances, profit =0
        for(int i=0; i<N; i++)
        {
            table[0][i]=0;
        }
        
        for(int i=1; i<=K; i++)
        {
            int difference=Integer.MIN_VALUE;
            for(int j=1; j<N; j++)
            {
                difference=Math.max(difference,table[i-1][j-1]-A[j-1]);
                table[i][j]=Math.max(table[i][j-1],A[j]+difference);
                
            }
        }
       
        
        return table[K][N-1];
        // code here
    }
}
