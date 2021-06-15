class Solution {
    
    public Node insertInMid(Node head, int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
            return temp;
        }
        Node fast=head.next;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
           
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=slow.next;
        slow.next=temp;
        return head;
        //Insert code here, return the head of modified linked list
    }
}
