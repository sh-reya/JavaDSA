class Tree
{
    
     
    boolean isBalanced(Node root)
    {
       
       
        if (root == null) 
        {
            return true; 
        }
        
        int LH = height(root.left); 
        int RH = height(root.right); 
  
        if (Math.abs(LH - RH) <= 1 && isBalanced(root.left) && isBalanced(root.right)) 
        {
             return true; 
        }
        else
        {
            return false;
        }
            
	
    }
    
    int height(Node root) 
    { 
        
        if (root == null) 
            return 0; 
  
        
        return 1 + Math.max(height(root.left), height(root.right)); 
    } 
}

