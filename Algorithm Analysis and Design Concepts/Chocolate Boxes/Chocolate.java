import java.util.*;
public class Chocolate
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of boxes: ");
    int n = sc.nextInt();
    if(n>0 && n<=10)
    {
      int [] arr = new int[n];
      System.out.print("Enter the no. of chocolates in box 1: ");
      arr[0] = s.nextInt();
      if(arr[0]%2==0)
      {
        int flag = 0;
        for(int i=1;i<n;i++)
        {
          System.out.print("Enter the no. of chocolates in box "+(i+1)+": ");
          arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
          if(arr[i]%2==0)
            flag++;
        }
        System.out.print("No. of chocolates in each box: ");
        for(int i=flag;i<n;i++)
        System.out.print(arr[i]+" ");
      }
      else
      {
        System.out.println("Sorry!!! First box always should contain positive even no. of chocolates");
      }
    }
    else
    {
      System.out.println("Invalid input");
    }
  }
}
