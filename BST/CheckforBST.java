public class Solution
{
    // return true if the given tree is a BST, else return false
   boolean isBST(Node root)
    {
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean check(Node root,int min,int max)
    {
        if(root==null)
        {
            return true;
        }
        
        return root.data>min&&root.data<max&&check(root.left,min,root.data)&&check(root.right,root.data,max);
    }
        
}
