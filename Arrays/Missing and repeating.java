class Solve 
{
    int[] findTwoElement(int a[], int n) 
    {
        int ans[]=new int[2];
        for(int i=0; i<n; i++)
        {
            int abs=Math.abs(a[i]);
            if(a[abs-1]>0)
            {
                a[abs-1]= -a[abs-1];
            }
            else
            {
                ans[0]=abs;
            }
        }
        for(int i=0; i<n; i++)
        {
            if(a[i]>0)
            {
                ans[1]=i+1;
            }
        }
        return ans;
        // code here
    }
}
