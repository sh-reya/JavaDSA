class Solution
{
  //Function to find median of the array elements.  
  public int median(int a[],int n)
    {
      int ans=0;
       Arrays.sort(a);
       if(n%2!=0)
       {
           ans=a[n/2];
       }
       else
       {
           ans=(int)((a[n/2]+a[(n/2)-1])/2);
       }
       return ans;
       
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int a[],int n)
    {
        int ans=0;
        for(int i=0; i<n; i++)
        {
            ans+=a[i];
        }
        ans=(int)(ans/n);
        
        return ans;
       //Your code here
    }

}

