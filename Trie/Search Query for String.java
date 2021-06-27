static void insert(String key) 
{
    TrieNode curr=root;
    for(int i=0; i<key.length(); i++)
    {
        int index=key.charAt(i)-'a';
        if(curr.children[index]==null)
        {
            curr.children[index]=new TrieNode();
        }
        curr=curr.children[index];
    }
    curr.isEndOfWord=true;
    // Your code here
}

//Function to use TRIE data structure and search the given string.
static boolean search(String key)
{
    TrieNode curr=root;
    for(int i=0; i<key.length(); i++)
    {
        int index=key.charAt(i)-'a';
        if(curr.children[index]==null)
        {
            return false;
        }
        curr=curr.children[index];
    }
    return curr.isEndOfWord;
    // Your code here
}
