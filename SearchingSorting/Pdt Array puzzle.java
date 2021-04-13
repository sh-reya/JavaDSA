class Solution 
{ 
	public static long[] productExceptSelf(int a[], int n) 
	{ 
	    long ans[]=new long[(int)n];
	    int index=0;
	    int pdt=1;
	    for(int i=0; i<n; i++)
	    {
	        pdt=pdt*a[i];
	        
	    }
	    //System.out.print(pdt);
	    for(int ptr=0; ptr<n; ptr++)
	    {
	        ans[index]=pdt/a[ptr];
	        index++;
	    }
	    return ans;
        // code here
	} 
} 
