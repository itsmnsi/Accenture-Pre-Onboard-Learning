import java.util.*;
class ShopMain
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[1000];
    System.out.println("Enter the no. of users:");
    int n = sc.nextInt();
    if(n>=1 && n<=1000)
    {
      for(int i=1;i<=n;i++)
      {
        System.out.println("Enter the credit points for user "+i+": ");
        a[i] = sc.nextInt();
        if(a[i]<=0 && a[i]>100)
        {
          i--;
        }
      }
      System.out.println("Enter the no. of users to serve: ");
      int k = sc.nextInt();
      if(k>=1 && k<n)
      {
        System.out.println("The unserved user's credit points are: ");
        for(int i=k+1;i<=n;i++)
        {
          System.out.println(a[i]+" ");
        }
      }
      else if(k==n)
      {
        System.out.println("0 users to serve");
      }
      else if(k<0 || k>n)
      {
        System.out.println("Invalid no.of users");
      }
    }
    else
    {
      System.out.println("Invalid  no. of users");
    }
  }
}
