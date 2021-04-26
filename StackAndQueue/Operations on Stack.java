class Geeks
{
    // Function to insert element to stack
    public static void insert(Stack<Integer> st, int x)
    {
        st.push(x);
        // Your code here
        
    }
    
    // Function to pop element from stack
    public static void remove(Stack<Integer> st)
    {
        if(st.isEmpty()) return;
        int x = st.pop();// Your code here
        
    }
    
    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st)
    {
        if(!st.isEmpty())
        {
        int x = st.peek();// Your code here
        System.out.println(x + " ");
        }
        return;
    }
    
    // Function to find the element in stack
    public static boolean find(Stack<Integer> st, int val)
    {
        return st.contains(val);
        
    }
}
