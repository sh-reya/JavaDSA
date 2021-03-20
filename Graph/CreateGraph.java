import java.util.*;
public class GraphFromScrath
{
  public static void main(Strings[] args)
  {
    Scanner s=new Scanner(System.in);
    int V=s.nextInt();
    int E=s.nextInt();
    
    ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<>>();
    for(int i=0; i<V; i++)
    {
      adj.add(new ArrayList<Integer>());
    }
    
    for(int i=0; i<E; i++)
    {
      int source=s.nextInt();
      int destination=s.nextInt();
      
      adj.get(source).add(destination);
      adj.get(destination).add(source);
    }
  }
}
