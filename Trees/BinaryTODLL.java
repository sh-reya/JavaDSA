class Solution
{
    Node prev = null;
    Node head;
    Node bToDLL(Node root)
    
    {
        
        Node a=null;
        if(root==null)
        {
            return a;
        }
       bToDLL(root.left);

       if (prev == null) 
        {
            head = root;
            prev = root;
        } 
        else 
        {
            root.left = prev;
            prev.right = root;
            prev = root;
        }

    bToDLL(root.right);
    return head;
    
    }
        
}
