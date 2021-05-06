class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node r1, Node r2)
	{
	   
	    if(r1==null && r2==null)
	    {
	        return true;
	    }
	    if(r1!=null && r2!=null)
	    return ((r1.data==r2.data)&&(isIdentical(r1.left,r2.left)&&(isIdentical(r1.right,r2.right))));
	    
	    
	    return false;// Code Here
	}
	
}
