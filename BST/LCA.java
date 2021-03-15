class BST
{   
    // Returns the LCA of the nodes with values n1 and n2
    // in the BST rooted at 'root' 
	Node LCA(Node root, int n1, int n2)
	{
	    if(root==null)
	    {
	        return null;
	    }
	    if(root.data==n1||root.data==n2)
	    {
	        return root;
	    }
	    Node left=LCA(root.left,n1,n2);
	    Node right=LCA(root.right,n1,n2);
	    
	    if(left!=null && right!=null)
	    {
	        return root;
	    }
	    if(left!=null && right==null)
	    {
	        return left;
	    }
	    else
	    {
	        return right;
	    }
        // code here.    
    }
    
}
