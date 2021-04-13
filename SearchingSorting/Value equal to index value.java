class Solution 
{
    ArrayList<Integer> valueEqualToIndex(int a[], int n) 
    {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            if(a[i]==i+1)
            {
                al.add(a[i]);
            }
        }
        return al;
        // code here
    }
}
