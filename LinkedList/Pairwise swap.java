class Swap
{
    //Function to swap elements pairwise.
    public static Node pairwise_swap(Node node)
    {
        Node curr=node;
        while(curr!=null && curr.next!=null)
        {
            int temp=curr.data;
            curr.data=curr.next.data;
            curr.next.data=temp;
            
            curr=curr.next.next;
        }
        return node;
        // your code here
    }
       
}
