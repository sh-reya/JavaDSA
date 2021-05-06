class Tree
{
    //Function to find the vertical width of a Binary Tree.
    public static int verticalWidth(Node root)
	{
	    TreeMap<Integer,Integer>tm=new TreeMap<>();
	    int size=width(root,0,tm);
	    return size;
	    // code here.
	}
	
	static int width(Node root, int key, TreeMap<Integer,Integer>tm)
	{
	    if(root==null)
	    {
	        return 0;
	    }
	    width(root.left,key-1,tm);
	    tm.put(key,root.data);
	    width(root.right,key+1,tm);
	    
	    int size=tm.size();
	    return size;
	}
}
