class Solution
{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int a[], int n) 
    { 
        int req=Math.abs(a[0]-a[n-1]);
        
        
        for(int i=0; i<n-1; i++)
        {
            a[i]=Math.abs(a[i]-a[i+1]);
        }
        a[n-1]=req;
        
        Arrays.sort(a);
        
        return a[0];
        
        // Your code here
        
    }
}
