import java.util.Scanner;
public class ListDriver
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the list: ");
    int n = sc.nextInt();
    int i=0; key=0, count=0;
    if(n<=0)
    {
      System.out.println("Invalid input");
    }
    else
    {
      int[] a = new int[n];
      for(i=0;i<n;i++)
      {
        a[i] = sc.nextInt();
      }
      System.out.println("Printing the list: ");
      for(i=0;i<n;i++)
      {
        System.out.println(a[i]+" ");
      }
      System.out.println("\n Enter the key to find it's occurrence: ");
      key = sc.nextInt();
      for(i=0;i<n;i++)
      {
        if(a[i]==key)
        count++;
      }
      System.out.println(key+" occurs for "+count+" times.");
    }
  }
}
      
