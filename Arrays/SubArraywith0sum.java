class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int a[],int n)
    {
        HashSet<Integer> s=new HashSet<>();
        int sum=0;
        boolean flag=false;
        for(int i=0; i<n; i++)
        {
            s.add(sum);
            sum=sum+a[i];
            
            if(s.contains(sum))
            {
                flag=true;
                break;
            }
        }
        
        if(flag==true)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
