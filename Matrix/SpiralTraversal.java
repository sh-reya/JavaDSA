class Solution{
    static ArrayList<Integer> spirallyTraverse(int a[][], int r, int c)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int top=0, left=0,bottom=r-1, right=c-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left; i<=right; i++)
            {
                al.add(a[top][i]);
                
            }
            top++;
            
            for(int i=top; i<=bottom; i++)
            {
                al.add(a[i][right]);
                
            }
            right--;
            
            if(top<=bottom)
            {
                for(int i=right; i>=left; i--)
                {
                    al.add(a[bottom][i]);
                   
                }
                 bottom--;
            }
            
            if(left<=right)
            {
                for(int i=bottom; i>=top; i--)
                {
                    al.add(a[i][left]);
                    
                }
                left++;
            }
        }
        return al;
        // code here 
    }
}
