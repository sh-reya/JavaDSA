
class Solution
{
    
    // The function returns the root of the BST (currently rooted at 'root') 
    // after inserting a new Node with value 'Key' into it. 
    Node insert(Node root, int Key)
    {
        if(root==null)
        {
            root=new Node(Key);
            return root;
        }
        if(Key<root.data)
        {
            root.left=insert(root.left,Key);
        }
        else if(Key>root.data)
        {
            root.right=insert(root.right,Key);
        }
        return root;
        // your code here
    }
}
