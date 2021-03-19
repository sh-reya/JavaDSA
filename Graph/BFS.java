class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> al=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean [adj.size()];
        
        q.add(0);
        visited[0]=true;
        
        while(!q.isEmpty())
        {
            int temp=q.remove();
            al.add(temp);
            
            for(int neigh:adj.get(temp))
            {
                if(!visited[neigh])
                {
                    q.add(neigh);
                    visited[neigh]=true;
                }
            }
        }
        return al;
        // Code here
    }
    
    
}
