class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        //ArrayList<Integer> bl=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0; i<n1; i++)
        {
            map.put(A[i],1);
        }
        
        for(int i=0; i<n2; i++)
        {
            if((map.get(B[i])!=null) && (map.get(B[i])==1))
            map.put(B[i],2);
        }
        
        for(int i=0; i<n3; i++)
        {
            if((map.get(C[i])!=null) && (map.get(C[i])==2))
            {
            map.put(C[i],3);
            al.add(C[i]);
            }
        }
        
        if(al.isEmpty())
        {
            al.add(-1);
            
        }
        return al;
        
    }
}
