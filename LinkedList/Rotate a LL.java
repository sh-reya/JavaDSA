class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) 
    {
        int nodecount=0;
        for(Node t=head; t!=null; t=t.next)
        {
            nodecount++;
        }
        if(nodecount==k)
        {
            return head;
        }
        int count=1;
        Node temp1=head;
        Node temp2=head;
        Node temp3=head;
        while(count!=k)
        {
            temp1=temp1.next;
            count++;
        }
        while(temp2!=temp1.next)
        {
            temp2=temp2.next;
        }
        while(temp3.next!=null)
        {
            temp3=temp3.next;
        }
        temp1.next=null;
        temp3.next=head;
        head=temp2;
        //System.out.println(nodecount);
        return head;
        // add code here
    }
}
