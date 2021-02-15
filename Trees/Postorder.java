class Tree
{
    ArrayList<Integer>a=new ArrayList<Integer>();
    ArrayList<Integer> postOrder(Node root)
    {
        if(root==null)
        {
            return a;
        }
        else
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
            return a;
        }
       // Your code goes here
    }
}
