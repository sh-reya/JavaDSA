class Solution
{
    //Function to return non-repeated elements in the array.
    static ArrayList<Integer> printNonRepeated(int a[], int n)
    {
        HashMap<Integer, Integer>map=new HashMap<>();
        ArrayList<Integer>al=new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        
        for(int i=0; i<n; i++)
        {
            if(map.get(a[i])==1)
            {
                al.add(a[i]);
            }
        }
        return al;
        // add your code here
    }
}

