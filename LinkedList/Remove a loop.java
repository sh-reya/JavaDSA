class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        if(slow!=fast)
        {
            return;
        }
        slow=head;
        if(fast==head) //circular linkedlist
        {
            while(slow.next!=fast)
            {
                slow=slow.next;
            }
                slow.next=null;
            
        }
        else
        {
            while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
        }
        
        // code here
        // remove the loop without losing any nodes
    }
}
