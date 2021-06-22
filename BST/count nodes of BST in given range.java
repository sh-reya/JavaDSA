class Tree
{
    //static int count=0;
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        
        return fun(root,l,h);
        
       
        //Your code here
    }
    int fun(Node root, int l, int h)
    {
         if(root==null)
        {
            return 0;
        }
        
        if(root.data<l)
        {
            return fun(root.right,l,h);
        }
        else if(root.data>=l && root.data<=h)
        {
            return 1+fun(root.left,l,h)+fun(root.right,l,h);
        }
        else
        {
            return fun(root.left,l,h);
        }
     
    }
}
