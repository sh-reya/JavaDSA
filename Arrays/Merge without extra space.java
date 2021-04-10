class Solution 
{

    public void merge(int a[], int b[], int n, int m) 
    {
        int i=n-1;
        int j=0;
        while(i>=0 && j<m)
        {
            if(a[i]>b[j])
            {
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
            }
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        // code here
    }
}
