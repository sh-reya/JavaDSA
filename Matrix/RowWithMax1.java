class Solution 
{
    int rowWithMax1s(int a[][], int n, int m) 
    {
       
        int ans=0;
        int res=-1;
        for(int i=0; i<n; i++)
        { int  count=0;
            for(int j=m-1; j>=0; j--)
            {
                if(a[i][j]==1)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            if(count>ans)
            {
                ans=count;
                res=i;
            }
       }
        return res;
        
        // code here
    }
}
