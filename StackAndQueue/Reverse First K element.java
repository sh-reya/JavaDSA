class GfG
{
    //Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Stack<Integer>s=new Stack<>();
        Queue<Integer>temp=new LinkedList<>();
        int n=q.size();
        for(int i=0; i<k; i++)
        {
            s.push(q.remove());
        }
        for(int i=k; i<n; i++)
        {
            temp.add(q.remove());
        }
        
        for(int i=0; i<k; i++)
        {
            q.add(s.pop());
        }
        
        for(int i=k; i<n; i++)
        {
            q.add(temp.remove());
        }
        
        return q;
      //add code here.
    }
}
