static int permutationCoeff(int n,int k) 
    { 
        int table[][] = new int[n + 2][k + 2]; 
  
        for (int i = 0; i <= n; i++) 
        { 
            for (int j = 0; j <= Math.min(i, k); j++) 
            { 
                // Base Cases 
                if (j == 0) 
                    table[i][j] = 1; 
      
                
                else
                    P[i][j] = P[i - 1][j] + (j * P[i - 1][j - 1]); 
      
                // This step is important  
                // as P(i,j)=0 for j>i 
                P[i][j + 1] = 0; 
            } 
        } 
        return P[n][k]; 
    } 
