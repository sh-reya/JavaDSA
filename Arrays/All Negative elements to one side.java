class Compute 
{
    
    public void segregateElements(int a[], int n)
    {
        int temp[]=new int [n+1];
        int index=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]>0)
            {
                temp[index]=a[i];
                index++;
            }
        }
        
        for(int i=0; i<n; i++)
        {
            if(a[i]<0)
            {
                temp[index]=a[i];
                index++;
            }
        }
        
        for(int i=0; i<n; i++)
        {
            a[i]=temp[i];
        }
        // Your code goes here
    }
}
