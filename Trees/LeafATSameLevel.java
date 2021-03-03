class GfG
{
    boolean check(Node root)
    {
        if(root==null)
        {
            return true;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int current=Integer.MAX_VALUE;
        int level=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            level++;
            
            while(size>0)
            {
                Node temp=q.remove();
                
                if(temp.left!=null)
                {
                    q.add(temp.left);
                    
                    if(temp.left.left==null && temp.left.right==null)
                    {
                        if(current==Integer.MAX_VALUE)
                        {
                            current=level;
                        }
                        else if(current!=level)
                        {
                            return false;
                        }
                    }
                }
                    
                if(temp.right!=null)
                {
                    q.add(temp.right);
                    
                    if(temp.right.left==null && temp.right.right==null)
                    {
                        if(current==Integer.MAX_VALUE)
                        {
                            current=level;
                        }
                        else if(current!=level)
                        {
                            return false;
                        }
                    }
                }
                size--;
            }
        }
        return true;
	// Your code here	
    }
}
