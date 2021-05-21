class LeftIndex{ 

    static int leftIndex(int n, int a[], int x)
    {
        return fun(a,0,n-1,x);
    }
    
    static int fun(int a[], int low, int high, int x)
    {
        if(low>high)
        {
            return -1;
        }
        int mid=(low+high)/2;
        
        if(a[mid]<x)
        {
            return fun(a,mid+1,high,x);
        }
        
        else if(a[mid]>x)
        {
            return fun(a,low,mid-1,x);
        }
        else
        {
            if(mid==0 || a[mid-1]!=a[mid])
            {
                return mid;
            }
            
            else
            {
                return fun(a,low,mid-1,x);
            }
        }
    }
}

