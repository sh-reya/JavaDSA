class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String a[], int n)
    {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        
        int max=0;
        String winner="";
        String res[]=new String[2];
        for(Map.Entry<String,Integer> item:map.entrySet())
        {
            String name=item.getKey();
            Integer vote=item.getValue();
            
            if(vote>max)
            {
                max=vote;
                winner=name;
                
            }
            
            else if(vote==max && winner.compareTo(name)>0)
            {
                winner=name;
            }
        }
        res[0]=winner;
        res[1]=Integer.toString(max);
        
        return res;
        
        // add your code
    }
}
