class Solution
{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int a[], int x, int y)
    {
        int n=a.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high)
        {
            if(a[mid]<x)
            {
                int s=a[mid];
                a[mid]=a[low];
                a[low]=s;
                
                mid++;
                low++;
            }
            
            else if(a[mid]>y)
            {
                int s=a[mid];
                a[mid]=a[high];
                a[high]=s;
                high--;
            }
            
            else
            {
                mid++;
            }
        }
        
        // code here 
    }
}
