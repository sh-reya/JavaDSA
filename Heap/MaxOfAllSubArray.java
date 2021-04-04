class Solution
{
    static ArrayList <Integer> max_of_subarrays(int a[], int n, int k)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        //max_heap
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        //add initial k elements in the heap
        for(i=0; i<k; i++)
        {
            q.add(a[i]);
        }
        //as this is a max heap, the first element is the max
        //add the first element in the arraylist.
        al.add(q.peek());
        //remove that element from the maxheap.
        q.remove(a[0]);
        
        //iterate for next element and repeat the process.
        for(i=k; i<n; i++)
        {
            q.add(a[i]);
            al.add(q.peek());
            q.remove(a[i-k+1]);
        }
        return al;
    }
}
