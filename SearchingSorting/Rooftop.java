class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int a[], int n)
    {
        int count=0, res=0;
        for(int i=0; i<n-1; i++)
        {
            if(a[i]<a[i+1])
            {
                count++;
                res=Math.max(res,count);
            }
            else
            {
                count=0;
            }
            
        }
        return res;
        // Your code here
    }
    
}
