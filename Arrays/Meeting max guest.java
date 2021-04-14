class Solution
{
	public int[] findMaxGuests(int[] Entry,int Exit[], int N)
    {
        Arrays.sort(Entry);
        Arrays.sort(Exit);
        int temp[]=new int[N+N];
        for(int i=0; i<N; i++)
        {
            temp[i]=Entry[i];
        }
        for(int i=N; i<2*N; i++)
        {
            temp[i]=Exit[i-N];
        }
        Arrays.sort(temp);
        
        int i=0,j=0,k=0;
        int count=0,max=Integer.MIN_VALUE;
        int ans[]=new int[2];
            while(i<N && j<N && k<2*N)
            {
                if(temp[k]==Entry[i])
                {
                    count++;
                    //max=Math.max(count,max);
                    if(max<count)
                    {
                        max=count;
                        ans[0]=max;
                        ans[1]=temp[k];
                    }
                    
                    i++;
                    k++;
                }
                
                else /*if(temp[k]==Exit[j])*/
                {
                    count--;
                    j++;
                    k++;
                }
            }
           
            return ans;
        
        // add code here.
	}
}
