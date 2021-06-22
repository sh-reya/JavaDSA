class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    static int minDiff(Node  root, int k) 
    { 
        int d1=floor(root,k);
        int d2=ceil(root,k);
        int min1=Math.abs(k-d1);
        int min2=Math.abs(k-d2);
        
        if(min1<min2)
        {
            return min1;
        }
        else
        {
            return min2;
        }
        
        // Write your code here
    }
    
    static int floor(Node root, int k)
    {
        if(root==null)
        {
            return -1;
        }
        Node res=null;
        while(root!=null)
        {
            if(root.data==k)
            {
                return root.data;
            }
            else if(root.data>k)
            {
                root=root.left;
            }
            else
            {
                res=root;
                root=root.right;
            }
        }
        return res.data;
    }
    
    static int ceil(Node root, int k)
    {
         if(root==null)
        {
            return -1;
        }
        
        int res=-1;
        while(root!=null)
        {
            if(root.data==k)
            {
                return root.data;
            }
            else if(root.data<k)
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
    }
}

