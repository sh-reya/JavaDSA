class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) 
    {
       int max_sum=sum(a,n);
       if(max_sum<0)
       {
           return max_sum;
       }
       int req_sum=0;
       for(int i=0; i<n; i++)
       {
           req_sum+=a[i];
           a[i]= -1*a[i];
       }
       
       int ans=req_sum+sum(a,n);
       return Math.max(max_sum,ans);
        
    }
    
    static int sum(int a[], int n)
    {
        int res=a[0];
        int max=a[0];
        
        for(int i=1; i<n; i++)
        {
            max=Math.max(a[i],a[i]+max);
            res=Math.max(max,res);
        }
        return res;
    }
    
}

