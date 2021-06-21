class Tree 
{
    //Function to return the ceil of given number in BST.
    int findCeil(Node root, int x) 
    { 
        int res=-1;
        if (root == null)
            return -1;
        while(root!=null)
        {
            if(root.data==x)
            {
                return root.data;
            }
            else if(root.data<x)
            {
                root=root.right;
            }
            else
            {
                res=root.data;
                root=root.left;
            }
        }
        return res;
        // Code here
    } 
}
