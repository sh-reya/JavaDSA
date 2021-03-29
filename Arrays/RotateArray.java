class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int a[], int d, int n)
    {
        fun(a,d-1,0);
        fun(a,n-1,d);
        fun(a,n-1,0);
       
        // add your code here
    }
    static void fun(int a[], int high, int low)
    {
      while(low<high)
      {
         // swap(a[low],a[high]);
          {
              int temp=a[low];
              a[low]=a[high];
              a[high]=temp;
          }
          low++;
          high--;
      }
    }
   
}
