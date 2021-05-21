int minNumber(int a[], int l, int h)
{
    while(l<h)
    {
        if(a[l]>a[h] && a[h]>a[h-1])
        {
            h--;
        }
        else if(a[l]<a[h])
        {
            return a[l];
        }
        else
        {
            return a[h];
        }
    }
    // Your code here
    
}
