class Solution 
{
    public ArrayList<ArrayList<Integer>> fourSum(int[] a, int sum) 
    {
        ArrayList<ArrayList<Integer>> MasterList=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer>al=new ArrayList<>();
        int n=a.length;
        Arrays.sort(a);
        for(int i=0; i<n-3; i++)
        {
            if (i > 0 && a[i] == a[i - 1]) continue;
            for(int j=i+1; j<n-2; j++)
            {
                if (j > i + 1 && a[j] == a[j - 1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l)
                {
                    int old_left = k;
                    int old_right = l;
                if(a[i]+a[j]+a[k]+a[l]==sum)
                {
                    MasterList.add(new ArrayList<Integer>(Arrays.asList(a[i], a[j], a[k], a[l])));
                    
                    while (k < l && a[k] == a[old_left]) 
                    {
                        k++;
                    }
                    while (k< l && a[l] == a[old_right]) 
                    {
                        l--;
                    }
                        
                    
                }
                
                else if(a[i]+a[j]+a[k]+a[l]>sum)
                {
                    l--;
                }
                
                else
                {
                    k++;
                }
                    
                }
            }
            
           
        }
       
        return MasterList;
        
    }
}
