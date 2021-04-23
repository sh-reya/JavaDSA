class Solution {
    
    //Function to push an element in queue.
    void enqueue(Queue<Integer> q, int x)
    {
        q.add(x);
        // Code here
    }
    
    //Function to remove front element from queue.
    void dequeue(Queue<Integer> q)
    {
        q.remove();
        // code here
    }
    
    //Function to find the front element of queue.
    int front(Queue<Integer> q)
    {
        return q.peek();
        // Code here
    }
    
    //Function to find an element in the queue.
    String find(Queue<Integer> q, int x)
    {
        if(q.contains(x))
        {
            return "Yes";
        }
        return "No";
        // Code here
    }
}
