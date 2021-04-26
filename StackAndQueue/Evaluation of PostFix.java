class Solution
{
    public static int evaluatePostFix(String s)
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                stack.push(c-'0');
            }
            
            else
            {
                
                int n1=stack.pop();
                int n2=stack.pop();
                
                if((s.charAt(i))==('+'))
                {
                    stack.push(n2+n1);
                    
                }
                
                else if((s.charAt(i))==('-'))
                {
                   stack.push(n2-n1);
                   
                }
                
                if((s.charAt(i))==('*'))
                {
                   stack.push(n2*n1);
                   
                }
                
                if((s.charAt(i))==('/'))
                {
                    
                    stack.push(n2/n1);
                    
                }
                
            }
        }
        
       
        return stack.peek();
        // Your code here
    }
}
