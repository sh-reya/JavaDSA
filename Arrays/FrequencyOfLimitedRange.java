class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencycount(int a[], int n)
    {
        for(int i=0; i<n; i++)
        {
            a[i]=a[i]-1;
        }
        
        for(int i=0; i<n; i++)
        {
            a[a[i]%n]=a[a[i]%n]+n;
        }
        
        for(int i=0; i<n; i++)
        {
            a[i]=a[i]/n;
        }
        // code here
    }
}
