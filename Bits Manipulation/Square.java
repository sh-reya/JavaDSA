public static int square(int n)
    {
 
        // handle negative input
        if (n < 0)
            n = -n;
 
        // Initialize result
        int res = n;
 
        // Add n to res n-1 times
        for (int i = 1; i < n; i++)
            res += n;
 
        return res;
    }
