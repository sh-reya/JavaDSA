class Solution
{
    void buildHeap(int a[], int n)
    {
        int req=(n/2)-1;
        for(int i=req; i>=0; i--)
        {
            heapify(a,n,i);
        }
        // Your code here
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int a[], int n, int i)
    {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        
        if(l<n && a[l]>a[largest])
        {
            largest=l;;
        }
        if(r<n && a[r]>a[largest])
        {
            largest=r;
        }
        if(largest!=i)
        {
            int temp=a[i];
            a[i]=a[largest];
            a[largest]=temp;
            
            heapify(a,n,largest);
        }
        // Your code here
    }
    
    public void heapSort(int a[], int n)
    {
        
         buildHeap(a,n);
         for(int i=n-1; i>0; i--)
         {
             int temp=a[0];
             a[0]=a[i];
             a[i]=temp;
            
             heapify(a,i,0);
         }
        
        
        //code here
        
        
    }
 }
 
 
