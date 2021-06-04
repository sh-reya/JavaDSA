class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
        int n=pat.length();
        int m=txt.length();
        
        for(int i=0; i<=m-n;)
        {
            int j;
            for(j=0; j<n; j++)
            {
                if(pat.charAt(j)!=txt.charAt(i+j))
                {
                    break;
                }
            }
            if(j==n)
            {
                return true;
            }
            else if(j==0)
            {
                i++;
            }
            else
            {
                i=i+j;
            }
        }
        return false;
        // Your code here
    }
}
