class Solution
{
    public static Node reverse(Node node, int k)
    {
        Node curr=node,next=null,prev=null;
        int count=0;
        while(curr!=null && count<k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null)
        {
            Node rest_head=reverse(next,k);
            node.next=rest_head;
        }
        return prev;
        //Your code here
    }
}

