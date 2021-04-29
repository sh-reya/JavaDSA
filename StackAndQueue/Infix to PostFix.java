class Solution
{
    	static int Prec(char c)
		{
		    switch(c)
		    {
		        case '+':
		        case '-':
		            return 1;
		        case '*':
		        case '/':
		            return 2;
		        case '^':
		            return 3;
		        
		    }
		    return -1;
		}
    //Function to convert an infix expression to a postfix expression.
	public static String infixToPostfix(String s) 
	{
		// Your code here
	String ans =  new String("");
		Stack<Character> st = new Stack<>();
		for ( int i = 0 ;i< s.length() ; i++)  
		{
		    char c = s.charAt(i);
		    
		    // if operand , append to ans;
		    if(Character.isLetterOrDigit(c))
		     ans += c;
		     
		     else if(c=='(')
		     st.push(c);
		     
		     //if c is ')' , keep in popping until '('
		     
		     else if(c==')')
		     {
		         while(!st.isEmpty() && st.peek()!='(')
		           { ans +=st.pop(); } 
		     
		        st.pop();
		     }
		     
		     else  // if c is +,-,^,*;
		     {
		         while(!st.isEmpty() && Prec(c) <= Prec(st.peek()))
		         {ans += st.pop();}
		     
		        st.push(c);
		     }
		}
		
		// if any c is remaining, then just pop and append
		while(!st.isEmpty())
		{
		    if(st.peek() == '(')
		        return "Invalid Expression";
		    else
		    ans += st.pop();
		}
		return ans;
}
}
