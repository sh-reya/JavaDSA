class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        Stack <Character> stack=new Stack<Character>();
        for(int i=0; i<str.length(); i++)
        {
            stack.push(str.charAt(i));
        }
        
        for(int i=0; i<str.length(); i++)
        {
            System.out.print(stack.pop());
        }
        return ("");
        
        
        // Reverse the string str
    }
}
