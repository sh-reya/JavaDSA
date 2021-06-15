class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node fast=head;
        Node slow=head;
        int count=0;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        if(slow!=fast) return count;
        Node temp=fast.next;
                while(temp!=fast)
                {
                temp=temp.next;
                count++;
                }
        return count+1;
        //Add your code here.
    }
}
