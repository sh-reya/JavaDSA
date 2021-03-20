class Compute {
    
    public void rotate(long a[], long n)
    {
        int index=(int)n-1;
        int len=(int)n;
        long temp[]=new long[len];
        temp[0]=a[index];
       
        for(int i=0; i<n-1; i++)
        {
            temp[i+1]=a[i];
        }
        for(int i=0; i<n; i++)
        {
            a[i]=temp[i];
        }
    }
}
