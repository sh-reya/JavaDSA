class Tree {
    /* Complete the function to get diameter of a binary tree */
    int diameter(Node root) 
    {
        if(root==null)
        {
            return 0;
        }
        
        else
        {
            int LD=diameter(root.left);
            int RD=diameter(root.right);
            int LH=height(root.left);
            int RH=height(root.right);
            
            int req=1+LH+RH;
          
            return Math.max(req,Math.max(LD,RD));
        }
        // Your code here
    }


static int height(Node root)
{
    if (root==null)
    {
        return 0;
    }
    else
    {
        return 1+ Math.max(height(root.left), height(root.right));
    }
}
}
