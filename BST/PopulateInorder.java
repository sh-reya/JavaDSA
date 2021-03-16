class GFG
{
    static Node temp;
    public static void populateNext(Node root)
    {
        
        if(root==null)
        {
            return;
        }
        
        populateNext(root.left);
        
        if(temp!=null)
        {
            temp.next=root;
        }
        temp=root;
        
        populateNext(root.right);
        
        //Add your code here.
    }
}
