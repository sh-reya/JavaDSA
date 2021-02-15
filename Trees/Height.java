
class Solution {
    int height(Node node) 
    {
        if(node==null)
        {
            return 0;
        }
        else
        {
            int LH=height(node.left);
            int RH=height(node.right);
            
            if(LH>RH)
            {
                return LH+1;
            }
            else
            {
                return RH+1;
            }
        }
        // code here 
    }
}
