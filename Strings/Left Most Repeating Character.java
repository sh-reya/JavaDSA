class Solution
{
    //Function to find repeated character whose first appearance is leftmost.
    static int repeatedCharacter(String s)
    {
        HashMap<Character,Integer>map=new HashMap<>();
        int res=-1;
        
        for(int i=0; i<s.length(); i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i=0; i<s.length(); i++)
        {
            if(map.get(s.charAt(i))>1)
            {
                res=i;
                break;
            }
        }
        return res;
        // add your code here
    }
}
