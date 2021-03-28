class Solution
{
    // arr[]: input array
    // n: size of array
    //Function to find the length of longest subarray of even and odd numbers.
    public static int maxEvenOdd(int a[], int n)
    {
        int res=1;
        int current=1;
        
        for(int i=0; i<n-1; i++)
        {
            if(a[i]%2==0 && a[i+1]%2!=0 || a[i]%2!=0 && a[i+1]%2==0)
            {
                current++;
                res=Math.max(res,current);
            }
            else
            {
                current=1;
            }
        }
        return res;
        // your code here
    }
}
