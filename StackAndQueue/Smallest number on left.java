class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        ArrayList<Integer>al=new ArrayList<>();
        Stack<Integer>s=new Stack<>();
        
        s.push(a[0]);
        al.add(-1);
        
        for(int i=1; i<n; i++)
        {
            while(!s.isEmpty() && s.peek()>=a[i])
            {
                s.pop();
            }
            
            int ans=(s.isEmpty())?-1:s.peek();
            al.add(ans);
            
            s.push(a[i]);
        }
        return al;
        //code here
    }
}
