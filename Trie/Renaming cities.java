class Solution
{
    public static void check(String arr[],int n)
    {
        TreeMap<String,Integer>temp=new TreeMap<>();
	    Node root=new Node();
	    
	    for(int i=0;i<n;i++)
	    {
	        //searching if the string is already present in the trie or not.
	        int k=searchInTrie(root,arr[i]);
	        String s=arr[i];
	        
	        //if the string is present already in the trie we increase the
            //counter to count the number of times it appears in the trie.
	        if(k==Integer.MAX_VALUE)
	        {
	            if(temp.containsKey(s)){
	                int val=temp.get(s);
	                val++;
	                temp.put(s,val);
	            }
	            else
	                temp.put(s,1);
	            
	            System.out.print(s);
	            
	            if(temp.get(s)>1)
	                System.out.print(" "+temp.get(s));
	            System.out.println();
	        }
	        
	        else
	        {
	            //printing index upto which string can be uniquely identified.
	            for(int j=0;j<=k;j++)
	            {
	                if(j<s.length())
	                System.out.print(s.charAt(j));
	            }
	            //inserting the string.
	            insertInTrie(root,s);
	            if(temp.containsKey(s)){
	                int val=temp.get(s);
	                val++;
	                temp.put(s,val);
	            }
	            else
	                temp.put(s,1);
	            
	            if(temp.get(s)>1)
	                System.out.print(" "+temp.get(s));
	            System.out.println();
	            
	        }
	    }
    }
    
    
    
    static void insertInTrie(Node root, String s)
	{
	    
	    for(int i=0;i<s.length();i++)
	    {
	        if(root.mp.containsKey(s.charAt(i))==false)
	        {
	            root.mp.put(s.charAt(i),new Node());
	        }
	        root=root.mp.get(s.charAt(i));
	    }
	    root.isEndOfWord=true;
	}
	
	
	
	public static int searchInTrie(Node root, String s)
	{
	    int i=0;
	    for(i=0;i<s.length();i++)
	    {
	         if(root.mp.containsKey(s.charAt(i))==false)
	         return i;
	         root=root.mp.get(s.charAt(i));
	    }
	    
	    if(root.isEndOfWord==false)
	    {
	        return i;
	    }
	    
	    return Integer.MAX_VALUE;
	}
	
	
}
