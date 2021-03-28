class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int a[], int n, int x, int y) 
    {
        int c1=0;
        int c2=0;
        int min=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]==x)
            {
                c1++;
            }
            else if(a[i]==y)
            {
                c2++;
            }
            else
            {
                min=Math.min(x,y);
            }
        }
        if(c1>c2)
        {
            return x;
        }
        else if(c1<c2)
        {
            return y;
        }
        else
        {
            return min;
        }
        // code here
    }
}
