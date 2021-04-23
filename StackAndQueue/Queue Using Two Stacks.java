class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
        s1.push(x);
        
	   // Your code here
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        if(s1.isEmpty() && s2.isEmpty())
        {
            return -1;
        }
        while(!s1.isEmpty())
        {
        s2.push(s1.pop());
        }
        int ans=0;
       // while(!s2.isEmpty())
        {
           ans= s2.pop();
           
        }
        while(!s2.isEmpty())
        {
            s1.add(s2.pop());
        }
        return ans;
	   // Your code here
    }
}
