class Solution 
{
    int median(int matrix[][], int r, int c) 
    {
        int a[]=new int[r*c];
        int index=0;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                a[index]=matrix[i][j];
                index++;
            }
        }
        
        Arrays.sort(a);
        
        int n=a.length;
        return a[(n-1)/2];
        
        // code here        
    }
}
