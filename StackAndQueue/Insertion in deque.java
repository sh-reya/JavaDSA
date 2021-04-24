class Solution
{
    public static ArrayDeque<Integer> deque_Init(int a[], int n)
    {
        ArrayDeque<Integer>deq=new ArrayDeque<>();
        for(int i=0; i<n; i++)
        {
            deq.addLast(a[i]);
        }
        return deq;
        //Your code here
    }
}
