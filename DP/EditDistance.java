class Solution 
{
    public int editDistance(String s, String t) 
    {
        int l1=s.length();
        int l2=t.length();
        return fun(s,t,l1,l2); 
        // Code here
    }
    
    public int fun(String s, String t, int l1, int l2)
    {
       int table[][]=new int[l1+1][l2+1];
       for(int i=0; i<=l1; i++)
       {
           for(int j=0; j<=l2; j++)
           {
               if(i==0)
               {
                   table[i][j]=j;
               }
               else if(j==0)
               {
                   table[i][j]=i;
               }
               
               else if(s.charAt(i-1)==t.charAt(j-1))
               {
                   table[i][j]=table[i-1][j-1];
               }
               else
               {
                   table[i][j]=1+min(table[i][j-1],table[i-1][j],table[i-1][j-1]);
               }
           }
       }
       return table[l1][l2];
    }
    
    public int min(int a,int b, int c)
    {
        if(a<=b && a<=c)
        {
            return a;
        }
        if(b<=a && b<=c)
        {
            
            return b;
        }
        else
        {
            return c;
        }
    }
}
