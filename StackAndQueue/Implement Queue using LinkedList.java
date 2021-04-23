class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
	    QueueNode node=new QueueNode(a);
	    if(front==null)
	    {
	        front=rear=node;
	        return;
	        
	    }
	    else
	    {
	        rear.next=node;
	        rear=rear.next;
	    }
        // Your code here
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    
	    if(front==null)
	    {
	        return -1;
	    }
	    
	    QueueNode temp=front;
	    front=front.next;
	    
	    
	    if(front==null)
	    {
	        rear=null;
	    }
	    
	    return temp.data;
        // Your code here
	}
}




