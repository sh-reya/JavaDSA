class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        ArrayList<Integer>al=new ArrayList<>();
        Stack<Node>s1=new Stack<>();
        Stack<Node>s2=new Stack<>();
        
        if(root==null)
        {
            return al;
        }
        
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                Node temp=s1.pop();
                al.add(temp.data);
                
                if(temp.right!=null)
                {
                    s2.push(temp.right);
                }
                if(temp.left!=null)
                {
                    s2.push(temp.left);
                }
            }
            
            while(!s2.isEmpty())
            {
                Node temp=s2.pop();
                al.add(temp.data);
                
                if(temp.left!=null)
                {
                    s1.push(temp.left);
                }
                if(temp.right!=null)
                {
                    s1.push(temp.right);
                }
            }
            
            
        }
        return al;
        // Your code here
    }
}
