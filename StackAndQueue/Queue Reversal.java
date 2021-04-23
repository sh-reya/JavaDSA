class GfG
{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q)
    {
        Stack<Integer>s=new Stack<>();
        Queue<Integer>qrev=new LinkedList<>();
        
        while(!q.isEmpty())
        {
            s.push(q.poll());
        }
        while(!s.isEmpty())
        {
            qrev.add(s.pop());
        }
        
        return qrev;
        //add code here.
    }
}
