class Solution
{
    //Function to merge two nodes a and b.
    public void union_(int a, int b, int parent[], int rank[])
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
        // add your code here
    }

    //Function to check whether 2 nodes are connected or not.
    public boolean isConnected(int a, int b, int parent[], int rank[])
    {
        if(find(a,parent)==find(b,parent))
        {
            return true;
        }
        else
        {
            return false;
        }
        // add your code here
    }
    int find(int x, int parent[])
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
