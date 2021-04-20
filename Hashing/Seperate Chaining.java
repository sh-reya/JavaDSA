class Solution
{

    //Function to insert elements of array in the hashTable avoiding collisions.
    public ArrayList<ArrayList<Integer>> separateChaining(int a[], int n, int hashSize)
    {
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
      
      //creating an empty hash table
        for(int j=0; j<hashSize; j++)
        {
            al.add(new ArrayList<Integer>());
        }
      
      //adding elements in hashtable
        for(int i=0; i<n; i++)
        {
            int slot=a[i]%hashSize;
            al.get(slot).add(a[i]);
        }
        
        return al;
        //Your code here
    }
}
