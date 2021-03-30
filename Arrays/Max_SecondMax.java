class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int n, int a[])
    {
        ArrayList<Integer> al=new ArrayList<>(2);
        int res=-1;
        int largest=0;
        
        for(int i=1; i<n; i++)
        {
            if(a[i]>a[largest])
            {
                res=largest;
                largest=i;
            }
            
            else if(a[i]!=a[largest])
            {
                if(res==-1 || a[i]>a[res])
                {
                    res=i;
                }
            }
        }
            al.add(a[largest]);
            if(res!=-1)
            {
                al.add(a[res]);
            }
            else
            {
                al.add(-1);
            }
            
           
        
         return al;
        //code here.
    }
}
