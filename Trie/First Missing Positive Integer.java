public class Solution 
{
    public int firstMissingPositive(int[] a) 
    {
        int n=a.length;
        int ptr = 0;
 
    for(int i = 0; i < n; i++)
    {
        if (a[i] == 1)
        {
            ptr = 1;
            break;
        }
    }
 
    
    if (ptr == 0)
        return (1);
 
    
    for(int i = 0; i < n; i++)
        if (a[i] <= 0 || a[i] > n)
            a[i] = 1;
 
    
    for(int i = 0; i < n; i++)
        a[(a[i] - 1) % n] += n;
 
    
    for(int i = 0; i < n; i++)
        if (a[i] <= n)
            return (i + 1);
 
    
    return (n + 1);
}
    
     
   
}
