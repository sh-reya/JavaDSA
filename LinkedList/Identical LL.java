class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node h1, Node h2)
    {
        Node temp1=h1;
        Node temp2=h2;
        while(temp1!=null || temp2!=null)
        {
            if(temp1.data!=temp2.data)
            {
                return false;
            }
            else
            {
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return true;
        //write your code here 
    }
}
