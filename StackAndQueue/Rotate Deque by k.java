public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    for(int i=0; i<k; i++)
    {
        int element=deque.removeFirst();
        deque.addLast(element);
    }
    
    //Your code here
}

public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    for(int i=0; i<k; i++)
    {
        int element=deque.removeLast();
        deque.addFirst(element);
    }
    //Your code here
}
