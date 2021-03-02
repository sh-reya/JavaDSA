class Solution
{
	ArrayList <Integer> printBoundary(Node node)
	{
	    ArrayList<Integer> al=new ArrayList<>();
	    
	    if(node==null)
	    {
	        return al;
	    }
	    else
	    {
	        System.out.print(node.data+" ");
	        printLeft(node.left);
	        printLeaves(node.left);
	        printLeaves(node.right);
	        printRight(node.right);
	    }
	    return al;
	    
	}
	public void printLeft(Node node)
	{
	  if (node == null) 
	  {
        return;
      }

      if (node.left != null) 
      {
        System.out.print(node.data + " ");
        printLeft(node.left);
      } 
      else if (node.right != null) 
      {
        System.out.print(node.data + " ");
        printLeft(node.right);
      }
    }
	
	
	public void printLeaves(Node node) 
	{
        if (node == null) 
        {
            return;
        }

        printLeaves(node.left);

        if (node.left == null && node.right == null) 
        {
            System.out.print(node.data + " ");
        }
        printLeaves(node.right);
    }
    
    public void printRight(Node node) 
    {
        if (node == null) 
        {
            return;
        }

        if (node.right != null) 
        {
            printRight(node.right);
            System.out.print(node.data + " ");
        } 
        else if (node.left != null) 
        {
            printRight(node.left);
            System.out.print(node.data + " ");
        }
  }
    
    //return al;
}
