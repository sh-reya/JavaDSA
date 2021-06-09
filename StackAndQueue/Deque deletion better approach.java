//Function to erase the element from specified position X in deque.
public static void eraseAt(ArrayDeque<Integer> deq , int x)
{
    //Your code here
    int count =0;
    
    for(int i=x+1; i<deq.size(); i++)
    {
        deq.addFirst(deq.removeLast());
        count++;
    }
    deq.removeLast();
     for(int i=0; i<count; i++)
    {
        deq.addLast(deq.removeFirst());
    }
}

//Function to erase the elements in range start (inclusive), end (exclusive).
public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end)
{
    //Your code here
    int count =0;
     for(int i=end; i<deq.size(); i++)
    {
        deq.addFirst(deq.removeLast());
        count++;
    }
    for(int i=start ; i<end;i++)
    deq.removeLast();
    
    for(int i=0; i<count; i++)
    deq.addLast(deq.removeFirst());
    
}

//Function to erase all the elements in the deque.
public static void eraseAll(ArrayDeque<Integer> deq )
{
    //Your code here
    deq.clear();
}
