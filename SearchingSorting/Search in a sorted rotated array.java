class Solution
{
    int search(int a[], int l, int h, int x)
    {
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(a[mid]==x)
            {
                return mid;
            }
            
            if(a[l]<a[mid]) //left half sorted
            {
                if(x>=a[l] && x<a[mid])
                {
                    h=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            else //right half sorted
            {
                if(x>a[mid] && x<=a[h])
                {
                    l=mid+1;
                }
                else
                {
                    h=mid-1;
                }
            }
        }
        return -1;
        // Complete this function
    }
}
