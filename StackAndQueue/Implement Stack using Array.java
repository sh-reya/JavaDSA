class MyStack{

    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	/* The method push to push element
	    into the stack */
    void push(int a)
	{
	    top++;
	    arr[top]=a;
	    // Your code here
	} 
	
    /* The method pop which return 
      the element poped out of the stack*/
	int pop()
	{
	    if(top==-1)
	    {
	        return -1;
	    }
	    else
	    {
	    int res=arr[top];
	    top--;
	    
	    return res;
	    }
	}
}
        // Your code here


