class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer>a=new ArrayList<Integer>();
    static ArrayList<Integer> preorder(Node root)
    {
        if(root==null)
        {
            return a;
        }
        else
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
            return a;
        }
        // Code here
    }

}
