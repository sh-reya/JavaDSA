class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        int n=s.length();
        char str[]=s.toCharArray();
        fun(str,n);
        String result=String.valueOf(str);
        return result;
        // code here 
    }
    
    void fun(char s[], int n)
    {
        int start=0;
        for(int end=0; end<n; end++)
        {
            if(s[end]=='.')
            {
                rev(s,start,end-1);
                start=end+1;
            }
        }
        rev(s,start,n-1);
        rev(s,0,n-1);
    }
    void rev(char s[], int low, int high)
    {
        while(low<=high)
        {
            char temp=s[low];
            s[low]=s[high];
            s[high]=temp;
            
            low++;
            high--;
        }
    }
}
