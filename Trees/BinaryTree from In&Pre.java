class Solution
{
    
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        
        return fun(0,0,inorder.length-1, preorder,inorder);
        // code here 
    }
    
    public static Node fun(int prestart, int instart, int inend, int[] preorder, int[] inorder)
    {
        if(prestart>preorder.length-1 || instart>inend)
        {
            return null;
        }
        Node start=new Node(preorder[prestart]);
        int index=0;
        for(int i=instart; i<=inend; i++)
        {
            if(start.data==inorder[i])
            {
                index=i;
            }
        }
        {
        start.left=fun(prestart+1, instart, index-1, preorder, inorder);
        start.right=fun(prestart+index-instart+1,index+1,inend,preorder,inorder);
        }
        return start;
    }
}
