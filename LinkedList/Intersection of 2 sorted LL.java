class Sol
{
   public static Node findIntersection(Node h1, Node h2)
    {
        HashSet<Integer>set=new HashSet<>();
        Node c1=h1;
        while(c1!=null)
        {
            set.add(c1.data);
            c1=c1.next;
        }
        Node temp=null;
        Node s=null;
        Node e=null;
        Node c2=h2;
        while(c2!=null)
        {
            if(set.contains(c2.data))
            {
                set.remove(c2.data);
                temp=new Node(c2.data);
                if(s==null)
                {
                    s=temp;
                }
                else
                {
                   e.next=temp; 
                }
                e=temp;
            }
            c2=c2.next;
            
        }
        return s;
        // code here.
    }
}
