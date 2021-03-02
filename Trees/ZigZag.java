class GFG
{
    // return an array containing the zig zag level order traversal of the given tree
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> al=new ArrayList<>();
	    Stack<Node> s1=new Stack<Node>();
	    Stack<Node> s2=new Stack<Node>();
	    if(root==null)
	    {
	        return al;
	    }
	    s1.push(root);
	    while(!s1.isEmpty() || !s2.isEmpty())
	    {
	        while(!s1.isEmpty())
	        {
	            Node temp=s1.pop();
	            System.out.print(temp.data+" ");
	            
	            if(temp.left!=null)
	            {
	                s2.push(temp.left);
	            }
	            if(temp.right!=null)
	            {
	                s2.push(temp.right);
	            }
	        }
	        
	        
	        while(!s2.isEmpty())
	        {
	            Node temp=s2.pop();
	            System.out.print(temp.data+" ");
	            
	            if(temp.right!=null)
	            {
	                s1.push(temp.right);
	            }
	            
	            if(temp.left!=null)
	            {
	                s1.push(temp.left);
	            }
	            
	        }
	       
	        
	    }
	    return al;
	    //Add your code here.
	}
}
