class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
        int n=petrol.length;
        int start=0,curr_pet=0;
        int prev_pet=0;
        
        for(int i=0; i<n; i++)
        {
            curr_pet+=(petrol[i]-distance[i]);
            if(curr_pet<0)
            {
                start=i+1;
                prev_pet+=curr_pet;
                curr_pet=0;
            }
        }
        if(curr_pet+prev_pet>=0)
        {
            return start;
        }
        return -1;
	// Your code here	
    }
}
