void quickSort(int arr[], int low, int high)
{
    if (low < high)
        {
            
            
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    // code here
}
    
int partition (int arr[], int low, int high)
{
    int min = low-1;
        
        int pivot = arr[high];
        
        for(int i=low; i <= high; ++i) 
        {
            
            if(arr[i] < pivot) 
            
            {
                min++;
                int temp = arr[i];
                
                arr[i] = arr[min];
                arr[min] = temp;
            }
            
            
        }
        
        int lastElem = arr[high];
        arr[high] = arr[min+1];
        arr[min+1] = lastElem;
        
        return min+1;
    } 
