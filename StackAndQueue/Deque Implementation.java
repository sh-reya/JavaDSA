 public static void push_back_pb(ArrayDeque<Integer> dq, int x)
    {
        dq.addLast(x);
        
        //Your code here
        
        
    }
    
    /* Function to pop element from back
    * dq : dqueue From which element is to be popped
    */
    public static void pop_back_ppb(ArrayDeque<Integer> dq)
    {
        if(dq.isEmpty())
        {
            return;
        }
        else
        {
        dq.removeLast();
        }
      //Your code here
        
    }
    
    /* Function to return element from front
    * dq : dqueue from which element is to be returned
    */
    public static int front_dq(ArrayDeque<Integer> dq)
    {
         if(dq.isEmpty())
        {
            return -1;
        }
        else
        {
        return dq.peekFirst();
        }
      //Your code here
        
    }
    
    /* Function to push element to front
    * dq : dqueue in which element is to be pushed
    * x : element to be pushed
    */
    public static void push_front_pf(ArrayDeque<Integer> dq, int x)
    {
        dq.addFirst(x);
        
      //Your code here
        
    }
