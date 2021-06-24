class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        int key[]=new int[v];
        boolean mst[]=new boolean[v];
        int res=0;
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=0;
        
        for(int count=0; count<v; count++)
        {
            int u=-1;
            for(int i=0; i<v; i++)
            {
                if(!mst[i] && (u==-1 || key[i]<key[u]))
                {
                    u=i;
                }
            }
            mst[u]=true;
            res+=key[u];
            
            for(ArrayList<Integer>ab:adj.get(u))
            {
                if(mst[ab.get(0)]==false && (ab.get(0))!=0 && ab.get(1)<key[ab.get(0)])
                key[ab.get(0)]=ab.get(1);
            }
        }
        return res;
        // Add your code here
    }
}
