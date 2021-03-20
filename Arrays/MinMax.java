class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
       pair res;
       Arrays.sort(a);
       
       long min=a[0];
       int index=(int)n-1;
       long max=a[index];
       
       res=new pair(min,max);
       
       return res;
    }
}
