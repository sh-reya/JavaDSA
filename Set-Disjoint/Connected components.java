class Solution
{

    //Function to merge two nodes a and b.
    static void unionNodes( int a, int b, int parent[], int rank[], int n) 
    {
        int x_rep=find(a,parent);
        int y_rep=find(b,parent);
        
        if(x_rep==y_rep)
        {
            return;
        }
        if(rank[x_rep]<rank[y_rep])
        {
            parent[x_rep]=y_rep;
        }
        else if(rank[y_rep]<rank[x_rep])
        {
            parent[y_rep]=x_rep;
        }
        else
        {
            parent[y_rep]=x_rep;
            rank[x_rep]++;
        }
        // add your code
    }

    //Function to determine number of connected components.
    static int findNumberOfConnectedComponents( int n, int parent[], int rank[]) 
    {
        int c=0;
        boolean[] vis=new boolean[n+1];
        for(int i=1; i<=n; i++)
        {
            vis[find(i,parent)]=true;
        }
        for(int i=0; i<=n; i++)
        {
            if(vis[i]==true)
            {
                c++;
            }
        }
        return c;
        // add your code
    }
    
    static int find(int x, int parent[])
    {
        if(x==parent[x])
        {
            return x;
        }
        else
        {
            return find(parent[x],parent);
        }
        
    }
    
    
}
