class Solution{
    
    // Function to calculate span
    // price[]: input array
    public static int[] calculateSpan(int a[], int n)
    {
        Stack<Integer>s=new Stack<>();
        int res[]=new int[n+1];
        int index=0;
        
        s.add(0);
        res[index++]=1;
        
        for(int i=1; i<n; i++)
        {
            while(!s.isEmpty() && a[s.peek()]<=a[i])
            {
                s.pop();
            }
            int span=s.isEmpty()?i+1:i-s.peek();
            res[index++]=span;
            s.push(i);
        }
        
        return res;
        // Your code here
    }
    
}
