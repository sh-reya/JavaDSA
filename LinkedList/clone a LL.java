class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) 
    {
        Node next,temp;
        for(Node curr=head; curr!=null;)
        {
            next=curr.next;
            curr.next=new Node(curr.data);
            curr.next.next=next;
            curr=next;
        }
        
        for(Node curr=head; curr!=null; curr=curr.next.next)
        {
            curr.next.arb=(curr.arb!=null)?curr.arb.next:null;
        }
        
        Node org=head,copy=head.next;
        temp=copy;
        
        while(org!=null && copy!=null)
        {
            org.next=org.next!=null?org.next.next:org.next;
            copy.next=copy.next!=null?copy.next.next:copy.next;
            org=org.next;
            copy=copy.next;
        }
        return temp;
        // your code here
    }
}
