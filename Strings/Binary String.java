class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String s)
    {
        int res=0;
        int index=-1;
        for(int i=a-1; i>=0; i--)
        {
            if(s.charAt(i)=='1')
            {
                index++;
                res+=index;
            }
        }
        return res;
        // Your code here
    }
}
