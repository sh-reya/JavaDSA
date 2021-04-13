class Compute 
{
    public String isSubset( long a1[], long a2[], long n, long m) 
    {
        HashMap<Long, Integer>map=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            map.put(a1[i],1);
        }
        for(int i=0; i<m; i++)
        {
            if((map.get(a2[i]))==null)
            {
                return "No";
            }
        }
        return "Yes";
    }
}
