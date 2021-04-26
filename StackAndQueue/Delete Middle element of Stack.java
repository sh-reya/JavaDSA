class Solution
{
    //Function to delete middle element of a stack.


    public void deleteMid(Stack<Integer>s,int sizeOfStack)
    {
        int mid=(sizeOfStack)/2;
        Stack<Integer> temp=new Stack<>();
        
        for(int i=0; i<=mid; i++)
        {
            temp.push(s.pop());
        }
        
        temp.pop();
        
        while(!s.isEmpty())
        {
            temp.push(s.pop());
        }
        
        while(!temp.isEmpty())
        {
            s.push(temp.pop());
        }
        
    }
}

