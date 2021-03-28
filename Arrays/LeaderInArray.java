class Solution
{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int a[], int n)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int curr=a[n-1];
        al.add(curr);
        
        for(int i=n-2; i>=0; i--)
        {
            if(curr<=a[i]) //bhai equality lga di to ye leader nhi rha ab
            {
                curr=a[i];
                al.add(curr);
            }
        }
        Collections.reverse(al);
        return al;
    }
}
