class Solution 
{
    int getPairsCount(int[] a, int n, int k) 
    {
        HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++)
        {
            if(!map.containsKey(a[i]))
            {
                map.put(a[i],1);
            }
            else
            {
                map.put(a[i],map.get(a[i])+1);
            }
        }
        
       int double_count=0;
       for(int i=0; i<n; i++)
       {
           if(map.get(k-a[i])!=null)
           {
               double_count+=map.get(k-a[i]);
           }
           
           if(k-a[i]==a[i])
           {
                double_count--;
           }
       }
       
       
       return double_count/2;
        
    }
}
