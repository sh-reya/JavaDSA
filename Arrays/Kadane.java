class Solution
{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int a[], int n)
    {
        int sum=0;
        int ans=0;
        for(int i=0; i<n; i++)
        {
            if(sum+a[i]>0)
            {
                sum=sum+a[i];
            }
            else
            {
                sum=0;
            }
            
            ans=Math.max(ans,sum);
        }
        return ans;
        
        // Your code here
        
    }
    
}

