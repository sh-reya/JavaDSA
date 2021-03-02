class Tree{
    public int toSumTree(Node root)
    {
       
        if(root==null)
        {
            return 0;
        }
        else
        {
            int temp=root.data;
            root.data=toSumTree(root.left)+toSumTree(root.right);
            return root.data+temp;
        }
        
         //add code here.
    }
    
    public void display(Node root)
    {
		if(root!=null)
		{
			display(root.left);			
			System.out.print(root.data + "  " );
			display(root.right);
		}
	}
}
