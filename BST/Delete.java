class Tree
{
    // Return the root of the modified BST after deleting the node with value X
	public static Node deleteNode(Node root, int X)
	
    {
       if(root==null)
       {
           return root;
       }
        
        if (X < root.data)
            root.left = deleteNode(root.left,X);
        else if (X > root.data)
            root.right = deleteNode(root.right,X);
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    
    static int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null) 
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
		// code here.
}	
