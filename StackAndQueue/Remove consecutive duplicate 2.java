class Solution
{
    //Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str)
    {
        Stack<Character>s=new Stack<>();
        Stack<Character>temp=new Stack<>();
        String ans="";
        int n=str.length();
        
        s.push(str.charAt(0));
        
        for(int i=1; i<n; i++)
        {
            if(!s.isEmpty() && s.peek()==str.charAt(i))
            {
                s.pop();
            }
            
            else
            {
                s.push(str.charAt(i));
            }
        }
        
        while(!s.isEmpty())
        {
            temp.push(s.pop());
        }
        
        while(!temp.isEmpty())
        {
            ans+=temp.pop();
        }
        
        return ans;
        // your code here
    }
}
