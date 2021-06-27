static void insert(TrieNode root, String key) 
{
    TrieNode current=root;
    for(int i=0; i<key.length(); i++)
    {
        int index=key.charAt(i)-'a';
        if(current.children[index]==null)
        {
            current.children[index]=new TrieNode();
        }
        current=current.children[index];
    }
    current.isEndOfWord=true;
    // Your code here
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    TrieNode current=root;
    for(int i=0; i<key.length(); i++)
    {
        int index=key.charAt(i)-'a';
        if(current.children[index]==null)
        {
            return false;
        }
        current=current.children[index];
    }
    return current.isEndOfWord;
    
    
    
    // Your code here
}
