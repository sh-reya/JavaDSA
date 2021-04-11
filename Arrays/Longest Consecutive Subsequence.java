class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int a[], int n)
	{
	    int count=1,res=1;
	    Arrays.sort(a);
	    
	    for(int i=0; i<n-1; i++)
	    {
	        if(a[i+1]==a[i]) continue;
	        if(a[i+1]-a[i]==1)
	        {
	            count++;
	        }
	        else 
	        {
	            count=1;
	        }
	        
	        res=Math.max(res,count);
	    }
	    return res;
	   // add your code here
	}
}
