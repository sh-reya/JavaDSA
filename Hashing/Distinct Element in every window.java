class Solution
{
    ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        HashMap<Integer, Integer>map=new HashMap<>();
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0; i<k; i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        al.add(map.size());
        
        for(int i=k; i<n; i++)
        {
            map.put(a[i-k],map.get(a[i-k])-1);
            
            if(map.get(a[i-k])==0)
            {
                map.remove(a[i-k]);
            }
            
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            al.add(map.size());
        }
        return al;
        // code here 
    }
}
