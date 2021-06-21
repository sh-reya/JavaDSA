class Complete
{   // Function for finding maximum and value pair
    public static int[] Smallestonleft (int a[], int n) 
    {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(a[0]);
        int ans[]=new int[n];
        int index=0;
        ans[index++]=-1;
        
        for(int i=1; i<n; i++)
        {
            if(ts.lower(a[i])!=null)
            {
                ans[index++]=ts.lower(a[i]);
            }
            else
            {
                ans[index++]=-1;
            }
            
            ts.add(a[i]);
        }
        return ans;
        // Complete the function
    }
    
    
}
