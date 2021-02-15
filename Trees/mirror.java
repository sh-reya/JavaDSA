class Tree
{
    Node root;
    void mirror()
    {
        root=mirror(root);
    }
    Node mirror(Node node)
    {
        if(node==null)
        {
            return node;
        }
        else
        {
            Node LM=mirror(node.left);
            Node RM=mirror(node.right);
            
            node.left=RM;
            node.right=LM;
            
            return node;
        }
    }
}
