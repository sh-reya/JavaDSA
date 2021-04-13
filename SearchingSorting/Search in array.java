class Complete
{
    
   
    // Function for finding maximum and value pair
    public static int search (int a[], int n, int x, int k) 
    {
        for(int i=0; i<n; i++)
        {
            if(a[i]==x)
            {
                return i;
            }
        }
        
        return -1;
        //Complete the function
    }
    
    
}

