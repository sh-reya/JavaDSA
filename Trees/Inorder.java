class Tree
{
    // Return a list containing the inorder traversal of the given tree
    
    ArrayList<Integer> a=new ArrayList<Integer>();
    ArrayList<Integer> inOrder(Node root)
    
    {
        if(root==null)
        {
            return a;
        }
        
        else
        {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
            return a;
        }
        // Code
    }
    
    
}
