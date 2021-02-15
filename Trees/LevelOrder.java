class Level_order_traversal
{
    //You are required to complete this method
    static ArrayList <Integer> levelOrder(Node node) 
    {
        Queue<Node> q=new LinkedList<Node>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        Node root=node;
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            System.out.print(temp.data+ " ");
            
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
        return al;
        // Your code here
    }
}





