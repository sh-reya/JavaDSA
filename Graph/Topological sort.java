class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) 
    {
        int ans[]=new int[v];
        int index=0;
        int in_deg[]=new int[v];
        for(int i=0; i<v; i++)
        {
            for(int j:adj.get(i))
            {
                in_deg[j]++;
            }
        }
        
        Queue<Integer>q=new LinkedList<>();
        for(int i=0; i<v; i++)
        {
            if(in_deg[i]==0)
            {
                q.add(i);
            }
        }
        
        while(!q.isEmpty())
        {
            int u=q.poll();
            ans[index++]=u;
            
            for(int j:adj.get(u))
            {
                if(--in_deg[j]==0)
                {
                    q.add(j);
                }
            }
        }
        return ans;
        // add your code here
    }
}
