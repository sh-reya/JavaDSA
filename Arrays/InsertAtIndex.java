class Solution
{
    // You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int a[],int n,int index,int element)
    {
        for(int i=n-2; i>=index; i--)
        {
            a[i+1]=a[i];
        }
        a[index]=element;
        //Your code here, Geeks
    }


}
