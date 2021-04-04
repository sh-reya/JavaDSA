class Solution 
{
    int[] kLargest(int[] a, int n, int k) 
    {
        Arrays.sort(a);
        reverse(a);
        
        int res[]=new int[k];
        for(int i=0; i<k; i++)
        {
            res[i]=a[i];
        }
        return res;
        // code here
    }
    
    void reverse(int a[]) 
    { 
        int i, k, n = a.length; 
        int t;
        for (i = 0; i < n / 2; i++)
        { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
    }
}
