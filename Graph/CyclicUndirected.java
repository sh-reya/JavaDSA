class Solution
{
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        
        boolean vis[]=new boolean[V];
        /*for(int i=0; i<V; i++)
        {
            vis[i]=false;
        }*/
        for(int i=0; i<V; i++)
        {
            if(!vis[i])
            {
                if(fun(i,vis,-1,adj))
                {
                    return true;
                }
            }
        }
        return false;
        // Code here
    }
    
    boolean fun(int curr, boolean vis[], int parent, ArrayList<ArrayList<Integer>> adj)
    {
        vis[curr]=true;
        for(int i=0; i<adj.get(curr).size(); i++)
        {
            if(!vis[adj.get(curr).get(i)])
            {
                if(fun(adj.get(curr).get(i),vis,curr,adj))
                {
                    return true;
                }
            }
                
            else if(adj.get(curr).get(i)!=parent)
            {
                return true;
            }
            
        }
        return false;
    }
    
    
    
}
