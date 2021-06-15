class GfG
{
    boolean isCircular(Node head)
    {
        
        Node temp=head.next;
        if(head==null) return true;
        while(temp!=head && temp!=null)
        {
            temp=temp.next;
        }
        if(temp==head)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
	// Your code here	
    }
}
