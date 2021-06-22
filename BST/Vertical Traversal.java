class Pair
{
    Node node;
    int hd;
    Pair(Node n, int h)
    {
        node=n;
        hd=h;
    }
}

class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        ArrayList<Integer>al=new ArrayList<>();
        Queue<Pair>q=new LinkedList<>();
        TreeMap<Integer,ArrayList<Integer>>mp=new TreeMap<>();
        
        q.add(new Pair(root,0));
        
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            
            if(mp.containsKey(hd))
            {
                mp.get(hd).add(curr.data);
            }
            else
            {
                ArrayList<Integer>al2=new ArrayList<>();
                al2.add(curr.data);
                mp.put(hd,al2);
            }
            
            if(curr.left!=null)
            {
                q.add(new Pair(curr.left,hd-1));
            }
            if(curr.right!=null)
            {
                q.add(new Pair(curr.right,hd+1));
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> p: mp.entrySet())
        {
            ArrayList<Integer>al2=p.getValue();
            for(int x:al2)
            {
                al.add(x);
            }
        }
        return al;
        // add your code here
    }
}
