class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
        q1.add(a);
	    // Your code here	
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
        if(q1.isEmpty())
        {
            return -1;
        }
        reverse(q1);
        while(!q1.isEmpty())
        {
            q2.add(q1.remove());
        }
        int temp=q2.remove();
        
        reverse(q2);
        while(!q2.isEmpty())
        {
            q1.add(q2.remove());
        }
        return temp;
        
	    // Your code here
    }
    
    void reverse(Queue<Integer>q)
    {
        if(q.isEmpty())
        {
            return;
        }
        
        int x=q.remove();
        reverse(q);
        q.add(x);
    }
	
}

