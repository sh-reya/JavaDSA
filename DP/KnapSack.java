class Knapsack 
{ 
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int W, int wt[], int val[], int n) 
    {
        int table[][]=new int[n+1][W+1];
        for(int i=0; i<n+1; i++)
        {
            for(int j=0; j<W+1; j++)
            {
                table[i][j]=-1;
            }
        }
        return fun(W,wt,val,n,table);
         // your code here 
    }
    static int fun(int W, int wt[], int val[], int n, int[][]table)
    {
        if(W==0 || n==0)
        {
            return 0;
        }
        if(table[n][W]!=-1)
        {
            return table[n][W];
        }
        if(wt[n-1]>W)
        {
            return table[n][W]=fun(W,wt,val,n-1,table);
        }
        else
        {
            return table[n][W]= max((val[n - 1] +fun (W - wt[n - 1], wt, val, n - 1, table)),fun (W, wt, val,n - 1, table));             

        }
    }
    static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }
}


