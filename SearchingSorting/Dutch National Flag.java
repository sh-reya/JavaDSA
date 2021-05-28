class Solution
{
    public static void sort012(int a[], int n)
    {
        int l=0, h=n-1, m=0;
        while(m<=h)
        {
            if(a[m]==0)
            {
                int t=a[l];
                a[l]=a[m];
                a[m]=t;
                
                m++;
                l++;
            }
            
            else if(a[m]==1)
            {
                m++;
            }
            else
            {
                int t=a[h];
                a[h]=a[m];
                a[m]=t;
                
                h--;
            }
        }
        // code here 
    }
}
