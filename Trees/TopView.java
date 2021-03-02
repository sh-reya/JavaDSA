class View
{
    static class Pair 
    {
    Node first;
    int second;
    Pair(Node n,int a)
    {
        first=n;
        second=a;
    }
    }
    // function should print the topView of the binary tree
    public static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer>al=new ArrayList<>();
        if (root==null)
        {
            return al;
        }
        TreeMap<Integer, Integer>tm=new TreeMap<Integer, Integer>();
        Queue<Pair> q= new LinkedList<Pair>();
        //int height;
        q.add(new Pair(root,0));
        
        while(!q.isEmpty())
        {
              Node temp = q.peek().first;
              int height = q.peek().second;
              q.remove();
            
            
            if(tm.get(height)==null)
            {
                tm.put(height,temp.data);
            }
            if(temp.left!=null)
            {
                
                q.add(new Pair(temp.left,height-1));
            }
            if(temp.right!=null)
            {
                
                q.add(new Pair(temp.right,height+1));
            }
        }
        for(Integer data:tm.values())
        {
            System.out.print( data + " ");
        }
        return al;
        // add your code
        
    }
    
    
}
