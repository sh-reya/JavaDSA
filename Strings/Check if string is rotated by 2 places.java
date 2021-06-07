class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String s1, String s2)
    {
        if(s1.length()!=s2.length()) //s1 and s2 have diff sizes
        {
            return false;
        }
        if((s1.length()>2) && (s1.equals(s2))) //adf adf
        {
            return false;
        }
        int ans=(s1+s1).indexOf(s2); //concat to chack rotation
        if(ans!=-1) 
            {
                if(ans==2 || ans==s1.length()-2 || ans==0)
                {
                    return true;
                }
            }
        return false;
        // Your code here
    }
    
}
