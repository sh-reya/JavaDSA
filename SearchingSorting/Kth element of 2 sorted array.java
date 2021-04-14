class Solution 
{
    public long kthElement( int a1[], int a2[], int n, int m, int k) 
    {
        int temp[]=new int[n+m];
        for(int i=0; i<n; i++)
        {
            temp[i]=a1[i];
        }
        for(int i=n; i<n+m; i++)
        {
            temp[i]=a2[i-n];
        }
        Arrays.sort(temp);
        
        long res=temp[k-1];
        return res;
        
    }
}
