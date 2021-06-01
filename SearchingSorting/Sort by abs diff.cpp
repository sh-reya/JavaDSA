class Solution{
    public:
    
    // A[]: input array
    // N: size of array
    //Function to sort the array according to difference with given number.
    void sortABS(int a[],int n, int k)
    {
        stable_sort(a,a+n, [k](int i, int j )
        {
            if(abs(k-i)<abs(k-j))
            {
                return true;
            }
            else
            {
                return false;
            }
        });
       //Your code here
    }

};
