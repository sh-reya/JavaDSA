class Solution
{
    // arr[]: input array
    // n: size of array
    
    //Function to return the count of non-repeated elements in the array.
    static long countNonRepeated(int a[], int n)
    {
        int count=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        
        for(Map.Entry<Integer, Integer>items:map.entrySet())
        {
            if(items.getValue()==1)
            {
                count++;
            }
        }
        return count;
        // add your code
    }
}
