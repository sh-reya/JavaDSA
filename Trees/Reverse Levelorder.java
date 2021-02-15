class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        Queue<Node> q=new LinkedList<Node>();
        ArrayList<Integer>al=new ArrayList<Integer>();
        Stack<Node> s=new Stack<Node>();
        Node root=node;
        q.add(root);
        Node res;
        while(!q.isEmpty())
        {
            Node temp=q.peek();
            q.remove();
            s.push(temp);
            
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
            
            
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            
           
        }
        while(!s.isEmpty())
        {
            res=s.peek();
            System.out.print(res.data+" ");
            s.pop();
            
        }
        return al;
        // code here
    }
}      
