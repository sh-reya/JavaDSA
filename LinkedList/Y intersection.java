class Intersect
{
    
  
		//Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         int c1= count(head1); //m
         int c2= count(head2); //n


        int d;
         if(c1>c2)
         { d =c1-c2;
         return traverse(d,head1,head2);
         }
         else
         {
              d=c2-c1;
             return traverse(d,head2,head1);
         }

	}
	int traverse(int d , Node node1, Node node2)
	{
	    Node curr1=node1; Node curr2=node2;
	    int count=0;
	    for(int i=0;i<d;i++)
	    {
	        if(curr1==null)
	        return -1;
	        curr1=curr1.next;
	    }

	    while(curr1!=null && curr2!=null)
	    {
	    if(curr1==curr2)  // check for node  not for data, else it will fail in some cases(where a common ele be present before the intersection)
	    return curr1.data;

	    curr1=curr1.next;
	    curr2=curr2.next;
	    }
	    return -1;
	}
	int count(Node head)
	{
	    if(head==null)
	    return 0;

	    Node curr1=head;
	    int c=0;
	     for( curr1=head;curr1!=null;curr1=curr1.next)
         {
             c++;
         }
         return c;
	} 
         // code here
	
}


