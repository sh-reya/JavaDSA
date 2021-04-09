class Solution 
{
    public boolean searchMatrix(int[][] a, int target) 
    {
        int row=a.length;
        int col=a[0].length;
        int i=0,j=col-1;
        
        while(i<row && j>=0)
        {
            if(a[i][j]==target) return true;
            else if(a[i][j]>target) j--;
            else i++;
        }
        return false;
        
    }
}
