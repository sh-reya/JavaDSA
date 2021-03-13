class Solution
{
    static int matrixMultiplication(int N, int arr[])
    {
        int table[][]=new int[N][N];
        int i;
        int j;
        int k;
        int l;
        int count=0;
        for(i=1; i<N; i++)
        {
            table[i][i]=0;
        }
        for(l=2; l<N; l++)
        {
            for(i=1; i<N-l+1; i++)
            {
            j=i+l-1;
            if(j==N)
            {
                continue;
            }
            table[i][j]=Integer.MAX_VALUE;
            for(k=i; k<=j-1; k++)
            {
                count=table[i][k]+table[k+1][j]+(arr[i-1]*arr[k]*arr[j]);
                if(count<table[i][j])
                {
                    table[i][j]=count;
                }
            }
            
            }
        }
         return table[1][N-1];
        
        // code here
        }
   

}
