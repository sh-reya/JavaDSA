class MyQueue {

    int front, size;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		size=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    if(size==100005)
	    {
	        return;
	    }
	    int rear=front+size-1;
	    rear=(rear+1)%100005;
	    arr[rear]=x;
	    size++;
	    //rear++;
	    // Your code here
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	   
	    
	    if(size==0)
	    {
	        return -1;
	        
	    }
	    
	    int temp=front;
	    front=(front+1)%100005;
	    size--;
	    
	    return arr[temp];
		// Your code here
	} 
}




