class Solution 
{
    //Function to return kth largest element from an array.
    public static int KthLargest(int a[], int n, int k) 
    {
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
        return pq.poll();
        // Your code here
    }
}
