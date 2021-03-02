class Tree
{
    static class Pair
    {
        Node value;
        int height;
        Pair(Node n, int h)
        {
            value=n;
            height=h;
        }
    }
 
    // Method that returns the bottom view.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer>al=new ArrayList<>();
        TreeMap<Integer, Integer>tm=new TreeMap<Integer, Integer>();
        Queue<Pair>q=new LinkedList<Pair>();
        
        if(root==null)
        {
            return al;
        }
        
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Node temp=q.peek().value;
            int x=q.peek().height;
            q.remove();
            
            tm.put(x,temp.data);
            
            if(temp.left!=null)
            {
                q.add(new Pair(temp.left,x-1));
            }
            if(temp.right!=null)
            {
                q.add(new Pair(temp.right,x+1));
            }
            
            
        }
        for(Integer all:tm.values())
        {
            System.out.print(all+" ");
            
        }
        return al;
    // Code here
    }
}
