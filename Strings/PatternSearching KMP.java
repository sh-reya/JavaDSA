class match
{
    //Function to fill lps[] for given patttern pat[0..M-1]. 
    void computeLPSArray(String s, int n, int lps[]) 
    { 
        lps[0]=0;
        int i=1;
        int len=0;
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }
            else
            {
                if(len==0)
                {
                    lps[i]=0;
                    i++;
                }
                else
                {
                    len=lps[len-1];
                }
            }
        }
	    // Your code here
	
    }
    
    //Function to check if the pattern exists in the string or not.
    boolean KMPSearch(String pat, String txt)
    {
        int n=txt.length();
        int m=pat.length();
        int lps[]=new int[m];
        
        computeLPSArray(pat,m,lps);
        
        int i=0,j=0;
        
        while(i<n)
        {
            if(pat.charAt(j)==txt.charAt(i))
            {
                i++;
                j++;
            }
            if(j==m)
            {
                return true;
            }
            
            else if(i<n && pat.charAt(j)!=txt.charAt(i))
            {
                if(j==0)
                {
                    i++;
                }
                else
                {
                    j=lps[j-1];
                }
            }
        }
        return false;
        // Your code here
    }
}
