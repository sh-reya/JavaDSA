class Insert
{
    // You only need to insert the given element at 
    // the end, i.e., at index sizeOfArray - 1. You may 
    // assume that the array already has sizeOfArray - 1
    // elements. 
    public void insertAtEnd(int a[],int size,int element)
    {
        if(size<a.length)
        {
            return;
        }
        int index=size-1;
        a[index]=element;
        //Your code here
    }
}
