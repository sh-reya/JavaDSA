class Solution
{
    //Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int L[], int R[], int n, int maxx)
    {
        int a[]=new int[1000000];
        Arrays.fill(a,0);
        for(int i=0; i<n; i++)
        {
            a[L[i]]++;
            a[R[i]+1]--;
        }
        int max=a[0],res=0;
        for(int i=1; i<1000000; i++)
        {
            a[i]+=a[i-1];
            if(max<a[i])
            {
                max=a[i];
                res=i;
            }
        }
        return res;
        
        
        
    }
    
}
