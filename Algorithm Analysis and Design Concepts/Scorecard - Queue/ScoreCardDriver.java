import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class ScoreCardDriver
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Queue<Integer> q = new LinkedList<Integer>();
    System.out.println("Enter the size of the score card:");
    int n, c=0;
    n = sc.nextInt();
    if(n>0 && n<=100)
    {
      for(int i=1;i<=n;i++)
      {
        System.out.println("Enter the hurdle race score "+i+":");
        int x = sc.nextInt();
        q.add(x);
      }
      for(int i=6;i<=n;i++)
      {
        q.remove();
        c++;
      }
      System.out.println("Latest hurdle race scores are: ");
      for(int i=1;i<=n-c;i++)
      {
        System.out.print(q.remove()+" ");
      }
    }
    else
    System.out.println("Invalid score card size");
  }
}
        
        
        
