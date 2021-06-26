class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int a[], int n, int k)
    {
        ArrayList<Integer>al=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0; i<k; i++)
        {
            pq.add(a[i]);
        }
        for(int i=k; i<n; i++)
        {
            if(pq.peek()<a[i])
            {
                pq.poll();
                pq.add(a[i]);
            }
            
        }
        for(int i=0; i<k; i++)
        {
            al.add(pq.poll());
        }
        Collections.sort(al, Collections.reverseOrder());
        return al;
        
    }
}
