class Complete
{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int a[], int n, int k) 
    {
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]<=k)
            {
                count++;
            }
        }
        
        int stupid=0;
        for(int i=0; i<count; i++)
        {
            if(a[i]>k)
            {
                stupid++;
            }
        }
        
        int ans=stupid;
        
        for(int i=0,j=count; j<n; i++,j++)
        {
            if(a[i]>k)
            {
                stupid--;
            }
            if(a[j]>k)
            {
                stupid++;
            }
            
            ans=Math.min(ans,stupid);
        }
        return ans;
        //Complete the function
    }
    
    
}
