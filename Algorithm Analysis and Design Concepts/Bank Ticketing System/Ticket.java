import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Ticket
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of customer takes the tickets:");
    int tick = sc.nextInt();
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> t = new LinkedList<>();
    int i;
    if(tick>=1)
    {
      for(i=1;i<=tick;i++)
      {
        q.add(i);
        t.add(i);
      }
      System.out.println("The tickets in the system are: ");
      for(i=1;i<=tick;i++)
      {
        System.out.println(q.remove()+" ");
      }
      System.out.println("\nEnter the number of tickets served:");
      int ser = sc.nextInt();
      System.out.println("The served tickets are:");
      for(i=1;i<=ser;i++)
      {
        System.out.println(t.remove()+" ");
      }
      if(tick==ser)
      {
        System.out.println("\nNo more tickets to be served");
      }
      else
      {
        System.out.println("\nThe unserved tickets are:");
        for(i=1;i<=tick-ser;i++)
        {
          System.out.print(t.remove()+" ");
        }
      }
    }
    else
    {
      System.out.println("Invalid Number");
    }
  }
}
    
    
