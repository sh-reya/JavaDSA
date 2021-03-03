class Tree
{
	boolean isSumTree(Node root)
	{
         if(root==null)
         {
             return true;
         }
         if(Sum(root.left)+Sum(root.right)==root.data)
         {
             return true;
         }// Your code here
         else
         {
             return false;
         }
	}
	int Sum(Node root)
	
	{
	    if(root==null)
	    {
	        return 0;
	    }
	    int temp=root.data;
        root.data=Sum(root.left)+Sum(root.right);
        return temp+root.data;
	}
}
