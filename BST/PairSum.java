class GFG 
{
    //Function to check if any pair exists in BST
    //whose sum is equal to given value.
    static boolean findPair(Node root, int x) 
    {
        HashSet<Integer>s=new HashSet<>();
        if(checkSum(root,x,s))
        {
            return true;
        }
        else
        {
            return false;
        }
        // Your code
    }
    static boolean checkSum(Node root, int x, HashSet<Integer>s)
    {
        if(root==null)
        {
            return false;
        }
        if(checkSum(root.left,x,s)==true)
        {
            return true;
        }
        if(s.contains(x-(root.data)))
        {
            return true;
        }
        else
        {
            s.add(root.data);
        }
        return checkSum(root.right,x,s);
    }
}
