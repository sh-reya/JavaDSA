class Tree{
    ArrayList<Integer> rightView(Node node) 
    {
        ArrayList<Integer> al= new ArrayList<>();
         if(node==null)
         {
             return al;
         }
         
         Queue<Node> q=new LinkedList<>();
         q.add(node);
         while(!q.isEmpty())
             {
                 int num=q.size();
                 for(int i=0; i<num; i++)
                 {
                     Node temp=q.poll();
                     if(i==num-1)
                     {
                         System.out.print(temp.data+" ");
                     }
                     if(temp.left!=null)
                     {
                         q.add(temp.left);
                     }
                     if(temp.right!=null)
                     {
                         q.add(temp.right);
                     }
                 }
             }
             return al;
         
        //add code here.
    }
}

