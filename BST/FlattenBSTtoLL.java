public static void flatten(Node root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            return;
        }
        if(root.left!=null)
        {
            flatten(root.left);
            
            Node temp=root.right;
            root.right=root.left;
            root.left=null;
            
            Node ptr=root.right;
            while(ptr.right!=null)
            {
                ptr=ptr.right;
            }
            ptr.right=temp;
        }
        flatten(root.right);
        //code here
    }
