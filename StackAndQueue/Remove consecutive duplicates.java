class Solution
{
    // Function to print string after removing consecutive duplicates
    public static String removeConsecutiveDuplicates(String str)
    {
        Stack<Character>s=new Stack<>();
        Stack<Character>temp=new Stack<>();
        String ans="";
        s.push(str.charAt(0));
        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i)==s.peek())
            {
                continue;
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
        // Your code here
    }
}
