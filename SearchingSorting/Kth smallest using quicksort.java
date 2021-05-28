class Solution
{
    //Function to find the kth smallest element in the array.
    public static int kthSmallest(int a[], int n, int k)
    {
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int p=part(a,l,h);
            if(p==k-1)
            {
                return a[p];
            }
            else if(p>k-1)
            {
                h=p-1;
            }
            else
            {
                l=p+1;
            }
        }
        return -1;
        // Your code here
    }
    static int part(int a[], int l, int h)
    {
        int p=a[h];
        int i=l-1;
        
        for(int j=l; j<h; j++)
        {
            if(a[j]<p)
            {
                i++;
                
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                
            }
        }
        
            int o=a[i+1];
            a[i+1]=a[h];
            a[h]=o;
        
        return i+1;
        }
        
    }

