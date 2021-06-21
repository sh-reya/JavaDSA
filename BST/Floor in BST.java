class Sol
{
    //Function to return the floor of given number in BST.
    int floor(Node root, int x) 
    {
        int res=-1;
        while(root!=null)
        {
            if(root.data==x)
            {
                return root.data;
            }
            else if(root.data>x)
            {
               root=root.left; 
            }
            else
            {
                res=root.data;
                root=root.right;
            }
        }
        return res;
        //code here.
    } 
 
}
