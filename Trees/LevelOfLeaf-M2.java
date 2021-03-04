class GfG
{
    int current=0;
    
    boolean check(Node root)
    {
        if(root==null)
        {
            return true;
        }
        
       return lol(root,1);
    	
    }
    
    boolean lol(Node root, int travel)
    {
        //part1
        if(root==null)
        {
            return true;
        }
        
        //part3
        if(root.left==null && root.right==null)
        {
            if(current==0)
            {
                current=travel;
                return true;
            }
           if(current==travel)
           {
               return true;
           }
           else
           {
               return false;
           }
        }
       /* else
        {
        if(root.left!=null)
        {
            return lol(root.left,travel+1);
        }
        if(root.right!=null)
        {
            return lol(root.right, travel+1);
        }
        }*/
        
        //part2
        else
        {
            return lol(root.left, travel + 1) && lol(root.right, travel + 1);
        }
        
        
		
    }
}
