class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> a = new ArrayList<>();
        int n = s.length();
        int Total_Set= (int)Math.pow(2, n); 
        
        for(int i=1; i<Total_Set; i++)
        {
            StringBuilder x = new StringBuilder();
            for( int j = 0; j < n ;j++)
            {
                if( (i &(1 << j)) !=0)
                {
                    x.append(s.charAt(j));
                }
            }
            
                a.add(x.toString());
        }
        Collections.sort(a);
        return a;
    }
}
