class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] a ,int n) 
    {
        HashMap<Long,Long>map=new HashMap<>();
        map.put((long)0,(long)1);
        
        long sum=0;
        long count=0;
        
        for(int i=0; i<n; i++)
        {
            sum=sum+a[i];
            if(map.containsKey(sum))
            {
                count=count+map.get(sum);
            }
            
            map.put(sum,map.getOrDefault(sum,(long)0)+1);
        }
        return count;
        //Your code here
    }
}
