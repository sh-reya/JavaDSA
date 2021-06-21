class Solution
{   
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int l,int r)
	{
	    ArrayList<Integer>al=new ArrayList<>();
	    return fun(root,l,r,al);
      // code here.
    }
    static ArrayList<Integer> fun(Node root,int l, int r, ArrayList<Integer>al)
    {
        if(root==null)
        {
            return al;
        }
        else
        {
            fun(root.left,l,r,al);
            if(root.data>=l && root.data<=r)
            {
                al.add(root.data);
            }
            fun(root.right,l,r,al);
        }
        return al;
    }
    
}
