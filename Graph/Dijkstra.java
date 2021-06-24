class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s)
    {
        int dis[]=new int[v];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[s]=0;
        boolean fin[]=new boolean[v];
        
        for(int count=0; count<v-1; count++)
        {
            int u=-1;
            for(int i=0; i<v; i++)
            {
                if(!(fin[i]) && (u==-1 || dis[i]<dis[u]))
                {
                    u=i;
                }
            }
            fin[u]=true;
            for(ArrayList<Integer>ab:adj.get(u))
            {
                if(!(fin[ab.get(0)]))
                {
                    dis[ab.get(0)]=Math.min(dis[ab.get(0)],dis[u]+ab.get(1));
                }
                
            }
            
        }
        return dis;
        // Write your code here
    }
}

