class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
        Node t1=head;
        Node t2=head;
        int count=0;
        while(t1!=null)
        {
            count++;
            t1=t1.next;
        }
        
        int req=count-n;
        
       if(req<0)
       {
           return -1;
       }
       
       else
       {
           for(int i=0; i<req; i++)
           {
               t2=t2.next;
           }
           
           return t2.data;
       }
      // System.out.println(req);
      // return 0;
    
    }
}
