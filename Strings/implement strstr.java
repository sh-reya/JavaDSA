class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
        int n=s.length();
        int m=x.length();
        
        for(int i=0; i<=n-m; i++)
        {
            int j;
            for(j=0; j<m; j++)
            {
                if(x.charAt(j)!=s.charAt(i+j))
                {
                    break;
                }
            }
            if(j==m)
            {
                return i;
            }
        }
        return -1;
       // Your code here
    }
}
