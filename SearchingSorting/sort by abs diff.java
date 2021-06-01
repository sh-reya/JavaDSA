class Solution
{
    //Function to sort the array according to difference with given number.
    static void sortABS(int a[], int n, int k)
    {
        TreeMap<Integer, ArrayList<Integer>> m=new TreeMap<>();
        for(int i=0; i<n; i++)
        {
            int diff=Math.abs(a[i]-k);
            if(m.containsKey(diff))
            {
                ArrayList<Integer>al=m.get(diff);
                al.add(a[i]);
                m.put(diff,al);
            }
            else
            {
                ArrayList<Integer> al=new ArrayList<>();
                al.add(a[i]);
                m.put(diff,al);
            }
        }
        
        int index = 0;
        for (Map.Entry e : m.entrySet())
        {
            ArrayList<Integer> al = m.get(e.getKey());
            for (int i = 0; i < al.size(); i++)
                    a[index++] = al.get(i);
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
        
        // add your code here
    }
}
