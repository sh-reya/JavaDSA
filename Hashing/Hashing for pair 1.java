class Geeks
{
    //Complete this function
    //Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int a[], int n, int sum)
    {
        HashSet<Integer>set=new HashSet<>();
    for(int i=0; i<n; i++)
    {
        if(set.contains(sum-a[i]))
        {
            return 1;
        }
        
        else
        {
            set.add(a[i]);
        }
    }
    return 0;
       //Your code here, Geeks
    }
}
