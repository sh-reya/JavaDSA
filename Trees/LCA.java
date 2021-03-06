class Tree
{

/* If n1 and n2 are present, return reference
   to LCA. If both are not present, return 
   null,. Else if left subtree contains any 
   of them return pointer to left.*/
	Node lca(Node root, int n1,int n2)
	{
	    if(root==null)
	    {
	        return null;
	    }
	    if(root.data==n1 || root.data==n2)
	    {
	        return root;
	        
	        
	    }
	    
	    Node left=lca(root.left,n1,n2);
	    Node right=lca(root.right,n1,n2);
	    
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
		// Your code here
	}
}

