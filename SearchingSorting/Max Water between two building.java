static int maxWater(int height[], int n) 
    { 
        
        int max = 0;
        int i = 0, j = n - 1;
        while (i < j) 
        {
            if (height[i] < height[j]) 
            {
                max = Math.max(max, (j - i - 1) * height[i]);
                i++;
            }
 
            
            else if (height[j] < height[i]) 
            {
                max = Math.max(max, (j - i - 1) * height[j]);
                j--;
            }
 
            
            else 
            {
                max = Math.max(max, (j - i - 1) * height[i]);
                i++;
                j--;
            }
        }
 
        return max;
    } 
