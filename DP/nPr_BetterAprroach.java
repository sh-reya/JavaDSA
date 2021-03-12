 static int permutationCoeff(int n,int k) 
    { 
        int []fact = new int[n+1]; 
      
        // base case 
        fact[0] = 1; 
      
        // Calculate value  
        // factorials up to n 
        for (int i = 1; i <= n; i++) 
            fact[i] = i * fact[i - 1]; 
      
        // P(n,k) = n! / (n - k)! 
        return fact[n] / fact[n - k]; 
    } 
