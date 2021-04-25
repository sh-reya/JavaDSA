class Solution
{
    public static long[] nextLargerElement(long[] a, int n) 
    { 
        Stack<Long> s=new Stack<>();
        long res[]=new long[n];
        int index=0;
        
        s.push(a[n-1]);
        res[index++]=(long)-1;
        
        for(int i=n-2; i>=0; i--)
        {
            while(!s.isEmpty() && s.peek()<=a[i])
            {
                s.pop();
            }
            
            long ans=(s.isEmpty()?(long)-1:s.peek());
            res[index++]=ans;
            s.push(a[i]);
        }
        // Your code here
        
        reverse(res);
        return res;
    } 
    
     static long[] reverse(long a[])
    {
        int n=a.length;
        int i, k;
        long t;
        for (i = 0; i < n / 2; i++) 
        {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
  
        /*printing the reversed array*/
        return a;
        
    }
    
}
