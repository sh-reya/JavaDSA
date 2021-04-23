class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        ArrayList<String> al=new ArrayList<>();
        Queue<String>q=new LinkedList<>();
        q.add("1");
        
        for(int i=0; i<N; i++)
        {
            String ans=q.remove();
            al.add(ans);
            q.add(ans+"0");
            q.add(ans+"1");
        }
        return al;
        // Your code here
    }
    
}
