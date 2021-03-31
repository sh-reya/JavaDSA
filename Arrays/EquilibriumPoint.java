class Solution 
{

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long a[], int n) 
    {
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=a[i];
        }
        int l_sum=0;
        for(int i=0; i<n; i++)
        {
            if(l_sum==sum-a[i])
            {
                return i+1;
            }
            l_sum+=a[i];
            sum-=a[i];
        }
        return -1;

        // Your code here
    }
}
