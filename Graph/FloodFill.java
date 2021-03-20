class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        if(image[sr][sc]==newColor)
        {
            return image;
        }
        int prev=image[sr][sc];
        fun(image,sr,sc,newColor,prev);
        return image;
    }
    
    static void fun(int image[][], int sr, int sc, int newC, int prev) 
    { /*
        int row=image.length;
        int col=image[0].length;*/
        if (sr < 0 || sr >=image.length || sc < 0 || sc >=image[0].length) 
            return; 
        if (image[sr][sc] != prev) 
            return; 
      
        // Replace the color at (x, y) 
        image[sr][sc] = newC; 
      
        // Recur for north, east, south and west 
        fun(image, sr+1, sc, newC, prev); 
        fun(image, sr-1, sc, newC, prev); 
        fun(image, sr, sc+1, newC, prev); 
        fun(image, sr, sc-1, newC, prev); 
    } 
      
}
