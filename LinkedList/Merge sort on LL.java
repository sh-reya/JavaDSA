//procedure:
//1. divide LL into half
//2. recursively sort each half
//3. merge the sorted LL.
class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node h)
    {
        if(h==null || h.next==null)
        {
            return h;
        }
        Node mid=middle(h);
        Node mid_plus_one=mid.next;
        
        mid.next=null;
        Node left=mergeSort(h);
        Node right=mergeSort(mid_plus_one);
        
        Node sortedLL=Merge(left,right);
        return sortedLL;
        // add your code here
    }
    static Node middle(Node h)
    {
        Node slow=h,fast=h;
        if(h==null)
        {
            return h;
        }
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    static Node Merge(Node a, Node b)
    {
        Node res=null;
        if(a==null)
        {
            return b;
        }
        if(b==null)
        {
            return a;
        }
        if(a.data<b.data)
        {
            res=a;
            res.next=Merge(a.next,b);
        }
        else
        {
            res=b;
            res.next=Merge(a,b.next);
        }
        return res;
    }
}


