class Solution
{
    public boolean findPair(int a[], int size, int n)
    {
        int i=0,j=1;
        Arrays.sort(a);
        while(i<size && j<size)
        {
            if(a[j]-a[i]==n)
            {
                return true;
            }
            else if(a[j]-a[i]>n)
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return false;
        
        //code here.
    }
}
