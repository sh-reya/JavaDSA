class Solution 
{
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean[] visited = new boolean[V];
        boolean[] rec = new boolean[V];
        
        for(int i=0; i< V; i++)
        {
            if(!visited[i] && fun(adj, i, visited, rec)) 
            {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean fun(ArrayList<ArrayList<Integer>> adj, int s, boolean visited[], boolean rec[]){
        
        visited[s] = true;
        rec[s] = true;
        
        for(int u : adj.get(s))
        {
            //return true if cycle found
            if(!visited[u] && fun(adj, u, visited, rec)) return true;
            if(rec[u]) return true;
        }
        
        rec[s] = false;
        return false;
        
    }
}
