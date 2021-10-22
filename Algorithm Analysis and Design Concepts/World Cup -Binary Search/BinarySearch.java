import java.util.Scanner;
class BinarySearch
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Teams:");
    int num = sc.nextInt();
    int ar[] = new int[num];
    System.out.println("Enter the score:");
    for(int i=0;i<num;i++)
    ar[i] = sc.nextInt();
    System.out.println("Enter the score to be searched:");
    int k = sc.nextInt();
    binarySearch(ar, 0, num-1, k);
  }
  public static void binarySearch(int ar[], int first, int last, int k)
  {
    int mid = (first+last)/2;
    while(first<=last)
    {
      if(ar[mid]<k)
      first = mid+1;
      else if(ar[mid]==k)
      {
        System.out.println(k+" is the score of Team "+(mid+1));
        break;
      }
      else
      last = mid-1;
      mid = (first+last)/2;
    }
    if(first>last)
    System.out.println("Score Not Found");
  }
}
