class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node r1,Node r2)
    {
        HashSet<Integer>s=new HashSet<>();
        ArrayList<Integer>al=new ArrayList<>();
        inorder(r1,s);
        return fun(r2,s,al);
        
        
    }
    static HashSet<Integer> inorder(Node r1, HashSet<Integer>s)
    {
        if(r1==null)
        {
            return s;
        }
        else
        {
            inorder(r1.left,s);
            s.add(r1.data);
            inorder(r1.right,s);
        }
        return s;
        
    }
    static ArrayList<Integer> fun(Node r2, HashSet<Integer>s, ArrayList<Integer> al)
    {
        if(r2==null)
        {
            return al;
        }
        else
        {
            fun(r2.left,s,al);
            if(s.contains(r2.data))
            al.add(r2.data);
            fun(r2.right,s,al);
        }
        return al;
    }
}
