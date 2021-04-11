class Solution 
{
    // Function to find maximum product subarray
    long maxProduct(int[] a, int n) 
    {
        long min=a[0];
        long max=a[0];
        long ans=a[0];
        
        for(int i=1; i<n; i++)
        {
            if(a[i]<0)
            {
                long temp=min;
                min=max;
                max=temp;
            }
            
            max=Math.max(a[i],max*a[i]);
            min=Math.min(a[i],min*a[i]);
            ans=Math.max(ans,max);
        }
        return ans;
        // code here
    }
}
