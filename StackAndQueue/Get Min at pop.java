class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> st = new Stack<>();
       
        
        for( int i =0 ; i<n; i++)
        {
            if(st.isEmpty())
            {
                st.push(arr[i]);
            }
            else
            {
                if(st.peek() <= arr[i])
                st.push(st.peek());
                else
                st.push(arr[i]);
            }
        }
        return st;
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        while(!s.isEmpty())
        System.out.print(s.pop()+ " ");
        
        System.out.println();
    }
}
