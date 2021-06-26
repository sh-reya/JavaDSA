class Triplet implements Comparable<Triplet>
{
    int val,apos,bpos,vpos;
    Triplet(int v,int ap,int vp)
    {
        val=v;
        apos=ap;
        vpos=vp;
    }
    public int compareTo(Triplet t)
    {
        if(val<t.val)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}

class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] a,int k) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        PriorityQueue<Triplet>pq=new PriorityQueue<>();
        
        for(int i=0; i<k; i++)
        {
            pq.add(new Triplet(a[i][0],i,0));
        }
        
        while(!pq.isEmpty())
        {
            Triplet curr=pq.poll();
            al.add(curr.val);
            int ap=curr.apos;
            int vp=curr.vpos;
            if(vp+1<a[ap].length)
            {
                pq.add(new Triplet(a[ap][vp+1],ap,vp+1));
            }
        }
        return al;
        // Write your code here.
        
        
    }
}

