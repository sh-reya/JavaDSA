public static int square(int n)
    {
 
        
        if (n < 0)
            n = -n;
 
        
        int res = n;
 
        
        for (int i = 1; i < n; i++)
            res += n;
 
        return res;
    }
