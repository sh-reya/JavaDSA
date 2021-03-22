class Solution
{
    class cell
    {
        int x,y;
        int dis;
    
        public cell(int x, int y, int dis)
        {
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
    
    }
    
    boolean Inside(int x, int y, int N)
    {
        if(x>=1 && x<=N && y>=1 && y<=N)
        {
            return true;
        }
        return false;
    }
    
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        int dx[]={-2,-2,2,2,-1,-1,1,1};
        int dy[]={-1,1,-1,1,-2,2,-2,2};
        
        Vector<cell> q=new Vector<>();
        q.add(new cell(KnightPos[0],KnightPos[1],0));
        
        cell t;
        int x,y;
        boolean vis[][]=new boolean[N+1][N+1];
        
        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=N; j++)
            {
                vis[i][j]=false;
            }
        }
        vis[KnightPos[0]][KnightPos[1]]=true;
        
        while(!q.isEmpty())
        {
            t=q.firstElement();
            q.remove(0);
            
            if(t.x==TargetPos[0] && t.y==TargetPos[1])
            {
                return t.dis;
            }
            
            for(int i=0; i<8; i++)
            {
                x=t.x+dx[i];
                y=t.y+dy[i];
                
                if(Inside(x,y,N) && !vis[x][y])
                {
                    vis[x][y]=true;
                    q.add(new cell(x,y,t.dis+1));
                }
            }
        }
        return Integer.MAX_VALUE;
        // Code here
    }
}
