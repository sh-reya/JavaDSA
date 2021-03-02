class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
          ArrayList<Integer> al=new ArrayList<>();
          Queue<Node> q=new LinkedList<>();
          
          if(root==null)
          {
              return al;
          }
          q.add(root);
          
          
          while(!q.isEmpty())
          {
              Node temp=q.remove();
              while(temp!=null)
              {
                System.out.print(temp.data+" ");
                       
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                temp=temp.right;
               }
          }
          return al;
              
          }
          
           //add your code here.
 }
