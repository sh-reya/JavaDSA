
class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> al=new ArrayList<>();
        boolean visited[]=new boolean[adj.size()];
        
        function(0,visited,al,adj);
        return al;
        // Code here
    }
    public void function (int current, boolean[] visited, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> adj)
    {
        visited[current]=true;
        al.add(current);
        
        for(int i=0; i<adj.get(current).size(); i++)
        {
            if(!visited[adj.get(current).get(i)])
            {
               function(adj.get(current).get(i),visited,al,adj);
            }
        }
    }
    
}
