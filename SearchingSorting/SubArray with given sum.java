class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] a, int n, int s) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        int curr=a[0];
        int i=0,j;
        for(j=1; j<=n; j++)
        {
            while(curr>s && i<j-1)
            {
                curr-=a[i];
                i++;
            }
            
            if(curr==s)
            {
                al.add(i+1);
                al.add(j);
                return al;
            }
            
            if(j<n)
            {
                curr+=a[j];
            }
        }
        if(al.size()==0)
        {
            al.add(-1);
        }
        return al;
        
        // Your code here
    }
}
