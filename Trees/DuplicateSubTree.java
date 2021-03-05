class Solution 
{
    int dupSub(Node root) 
    {
        if(root == null) 
        {
            return 0 ;
        }
        
        ArrayList<Node> al = new ArrayList<>() ;
        traverseLeftTree(root.left,al) ;
        
        for(Node nn : al)
        {
            Node dup = find(root.right,nn.data) ;
            if(dup != null)
            {
                if(nn.left != null && dup.left != null && nn.left.data == dup.left.data)
                {
                    return 1 ;
                }
                else if(nn.right != null && dup.right != null && nn.right.data == dup.right.data)
                {
                    return 1 ;
                }
            }
        }
        return 0 ;
    }
    
    Node find(Node root , int val)
    {
        
        if(root == null) return null ;
        if(root.data == val) return root ;
        Node left = find(root.left,val) ;
        if(left != null)
            return left ;
        return find(root.right,val) ;
    }
    
    void traverseLeftTree(Node root ,ArrayList<Node> al)
    {
        
        if(root == null) return ;
        al.add(root) ;
        //System.out.print(root.data+" ");
        traverseLeftTree(root.left,al) ;
        traverseLeftTree(root.right,al) ;
    }
}
