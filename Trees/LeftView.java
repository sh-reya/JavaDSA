class Tree
{
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> al=new ArrayList<>();
        if(root==null)
        {
            return al;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0; i<size; i++)
            {
                Node temp=q.poll();
                if(i==0)
                {
                    System.out.print(temp.data+" ");
                }
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
        }
        return al;
      // Your code here
    }
}
