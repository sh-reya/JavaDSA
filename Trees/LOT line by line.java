class Level_Order_Traverse
{
    //Function to return the level order traversal line by line of a tree.
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        if(node==null)
        {
            return al;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        q.add(null);
        
        while(q.size()>1)
        {
            Node curr=q.poll();
            if(curr==null)
            {
                System.out.print("$"+" ");
                q.add(null);
            }
            else
            {
                System.out.print(curr.data+" ");
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            
        }
        System.out.print("$");
        return al;
        // Your code here
    }
}
