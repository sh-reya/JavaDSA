public static void eraseAt(ArrayDeque<Integer> deq , int X)
{
    ArrayDeque<Integer>dq=new ArrayDeque<>();
    for(int i=0; i<X; i++)
    {
        dq.add(deq.removeFirst());
    }
    deq.removeFirst();
    
    for(int i=0; i<X; i++)
    {
        deq.addFirst(dq.removeLast());
    }
    
    //Your code here
}

public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end)
{
    ArrayDeque<Integer>dq=new ArrayDeque<>();
    for(int i=0; i<start; i++)
    {
        dq.add(deq.removeFirst());
    }
    for(int i=start; i<end; i++)
    {
        deq.removeFirst();
    }
    for(int i=0; i<start; i++)
    {
        deq.addFirst(dq.removeLast());
    }
    //Your code here
}

public static void eraseAll(ArrayDeque<Integer> deq )
{
    int n=deq.size();
    for(int i=0; i<n; i++)
    {
        deq.removeLast();
    }
    //Your code here
}
