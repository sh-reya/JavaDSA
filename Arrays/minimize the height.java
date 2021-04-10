
class Solution 
{
    static class Pair
    {
        int value;
        int index;
        Pair(int value, int index)
        {
            this.value=value;
            this.index=index;
        }
        public int getvalue()
        {
            return this.value;
        }
        public int getindex()
        {
            return this.index;
        }
    }
    int getMinDiff(int[] a, int n, int k) 
    {
        ArrayList<Pair>al=new ArrayList<>();
        int vis[]=new int[n];
        for(int i=0; i<n; i++)
        {
            if(a[i]-k>=0)
            {
                al.add(new Pair((a[i]-k),i));
            }
            al.add(new Pair((a[i]+k),i));
            vis[i]=0;
        }
        
        Collections.sort(al,new Comparator<Pair>()
        {
            public int compare(Pair p1, Pair p2)
            {
                return p1.getvalue()-p2.getvalue();
            }
        });
        
        int left=0;
        int right=0;
        int element=0;
        int size=al.size();
        while(element<n && right<al.size())
        {
            if(vis[al.get(right).getindex()]==0)
            {
                element++;
            }
            vis[al.get(right).getindex()]++;
            right++;
        }
        
        int ans=al.get(right-1).getvalue()-al.get(left).getvalue();
        
        while(right<size)
        {
            if(vis[al.get(left).getindex()]==1)
            {
                element--;
            }
            vis[al.get(left).getindex()]--;
            left++;
            
            while(element<n && right<al.size())
        {
            if(vis[al.get(right).getindex()]==0)
            {
                element++;
            }
            vis[al.get(right).getindex()]++;
            right++;
        }
        
        if(element==n)
        {
            ans=Math.min(ans,al.get(right-1).getvalue()-al.get(left).getvalue());
        }
        
        else
        break;
        }
        return ans;
        
        // code here
    }
}
