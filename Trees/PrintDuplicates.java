class Solution 
{
    static LinkedHashMap<String, Integer> m=new HashMap<>();
    static ArrayList<Integer> arr;
    public void printDup(Node root)
    {
        arr = new ArrayList<>();
        inOrder(root);
        Collections.sort(arr);
        if(arr.size()==0)
            System.out.print(-1);
        else
        {
            for(int i : arr)
                System.out.print(i+" ");
        }
        System.out.println();
    }
    
    
    public String inOrder(Node root)
    {
        if(root==null)
            return "";
            
        String str = "(";
        str += inOrder(root.left);
        str += String.valueOf(root.data);
        str += inOrder(root.right);
        str += ")";
        
        if (m.get(str)!=null && m.get(str)==1) 
            arr.add(root.data); 

        if (m.containsKey(str)) 
            m.put(str,m.get(str)+1); 
        else
            m.put(str,1); 
          
         
        return str; 
    }
}
