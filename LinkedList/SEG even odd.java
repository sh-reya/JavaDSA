class Solution
{
    Node divide(int n, Node head)
    {
        Node es=null,ee=null,os=null,oe=null;
        for(Node temp=head; temp!=null; temp=temp.next)
        {
            int x=temp.data;
            if(x%2==0)
            {
                if(es==null)
                {
                    es=temp;
                    ee=es;
                }
                else
                {
                    ee.next=temp;
                    ee=ee.next;
                }
            }
            else
            {
                if(os==null)
                {
                    os=temp;
                    oe=os;
                }
                else
                {
                    oe.next=temp;
                    oe=oe.next;
                }
            }
        }
        if(os==null || es==null)
        {
            return head;
        }
        ee.next=os;
        oe.next=null;
        
        return es;
        // code here
    }
}
