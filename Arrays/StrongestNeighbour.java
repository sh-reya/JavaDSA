
class StrongestNeighbour
{
    
    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacent(int n, int a[])
    {
        for(int i=1; i<n; i++)
        {
            System.out.print(Math.max(a[i],a[i-1])+" ");
        }
        
        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
        
    }
}
