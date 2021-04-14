class Solution
{
    // The function should do the stated modifications in the given array arr[]
    // Do not return anything.
    
    // arr[]: Input Array
    // N: Size of the Array arr[]
    //Function to segregate 0s, 1s and 2s in sorted increasing order.
    public static void segragate012(int a[], int N)
    {
        int low=0,high=N-1,mid=0;
        while(mid<=high)
        {
            if(a[mid]==0)
            {
                int t=a[mid];
                a[mid]=a[low];
                a[low]=t;
                mid++;
                low++;
            }
            
            else if(a[mid]==2)
            {
                int t=a[mid];
                a[mid]=a[high];
                a[high]=t;
                high--;
            }
            
            else
            {
                mid++;
            }
        }
        
        // Your Code Here
    }
}
