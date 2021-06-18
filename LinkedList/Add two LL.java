class Solution
{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node h1, Node h2)
    {
        Node c1=rev(h1);
        Node c2=rev(h2);
        int sum=0,carry=0;
        Node s=null,e=null;
        while(c1!=null || c2!=null)
        {
            sum=((c1!=null?c1.data:0)+(c2!=null?c2.data:0))+carry;
            carry=sum/10;
            sum=sum%10;
            
            Node ans=new Node(sum);
            if(s==null)
            {
                s=ans;
                e=ans;
            }
            else
            {
                e.next=ans;
                e=ans;
            }
            
            if(c1!=null)c1=c1.next;
            if(c2!=null)c2=c2.next;
        }
        if(carry>0)
        {
            e.next=new Node(carry);
        }
        Node res=rev(s);
        return res;
    }
    static Node rev(Node head)
    {
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
        
    }
}
