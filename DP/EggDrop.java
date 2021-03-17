class EggDrop 
{
    static int eggDrop(int n, int k) 
	{
	    int table[][]=new int[n+1][k+1];
	    
	    //mere paas 1 egg h, result hmesha =no of floor.
	    for(int i=1; i<=k; i++)
	    {
	        table[1][i]=i;
	    }
	    
	    //mere paas 1or0 floor h, to kitne bhi egg ho, ans 1/0 
	    for(int i=1; i<=n; i++)
	    {
	        table[i][0]=0;
	        table[i][1]=1;
	    }
	    int i,j,x;
	    int res=0;
	    
	    //ab ans nikalo 2nd floor se, 1 se zada egg k liye
	    
	    //2 se zada egg
	    for(i=2; i<=n; i++)
	    {
	        //2 se zada floor h
	        for(j=2; j<=k; j++)
	        {
	        //set krenge max value
	        table[i][j]=Integer.MAX_VALUE;
	        
	        //ab try kro hr ek floor se
	        for(x=1; x<=j; x++)
	        {
	            res=1+(Math.max(table[i-1][x-1], table[i][j-x]));
	            if(res<table[i][j])
	            {
	                table[i][j]=res;
	            }
	        }
	        }
	    }
	    return table[n][k];
	   
	    // Your code here
	}
}
