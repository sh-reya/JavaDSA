class Solution 
{
    public int maxArea(int M[][], int m, int n) 
    {
        int res=largest(m,n,M[0]);
        for(int i=1; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(M[i][j]==1)
                {
                    M[i][j]+=M[i-1][j];
                }
            }
            res=Math.max(res,largest(m,n,M[i]));
        }
        return res;
        // add code here.
    }
    
    int largest(int m, int n, int a[])
    {
        Stack<Integer>s=new Stack<>();
        int top,max=0,area=0;
        int i=0;
        
        while(i<n)
        {
            if(s.isEmpty() || a[s.peek()]<=a[i])
            {
                s.push(i++);
            }
            else
            {
                top=a[s.peek()];
                s.pop();
                area=top*i;
                
                if(!s.isEmpty())
                {
                    area=top*(i-s.peek()-1);
                }
                max=Math.max(area,max);
            }
        }
        
        while(!s.isEmpty())
        {
            top=a[s.pop()];
            area=top*i;
            if(!s.isEmpty())
            {
                area=top*(i-s.peek()-1);
            }
            
            max=Math.max(area,max);
        }
        
        return max;
    }
}
