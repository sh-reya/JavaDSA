class Solution 
{
    int rowWithMax1s(int a[][], int n, int m) 
    {
        int i=0, j=m-1;
        int ans=-1;
        while(i<n && j>=0)
        {
            if(a[i][j]==1)
            {
                j--;
                ans=i;
            }
            
            else
            i++;
        }
        return ans;
        
        // code here
    }
}
