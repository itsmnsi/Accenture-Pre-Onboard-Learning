import java.util.Scanner;
class QuickSort
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many elements?");
    int n = sc.nextInt();
    if(n<=0)
    System.out.println("Invalid Input");
    else
    {
      int ar[] = new int[n];
      System.out.println("Enter array elements:");
      for(int i=0;i<n;i++)
      ar[i] = sc.nextInt();
      quickSort(ar, 0, n-1);
      System.out.println("Array after sorting:");
      for(int i=0;i<n;i++)
      System.out.println(ar[i]+" ");
    }
  }
  public static int partition(int[] ar, int start, int end)
  {
    int pivot = ar[end];
    int i = start-1;
    for(int j=start;j<end;j++)
    {
      if(ar[j]<=pivot)
      {
        i++;
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
      }
    }
    int temp = ar[i+1];
    ar[i+1] = ar[end];
    ar[end] = temp;
    return i+1;
  }
  public static void quickSort(int ar[], int start, int end)
  {
    if(start<end)
    {
      int pi = partition(ar, start, end);
      quickSort(ar, start, end-1);
      quicksort(ar, start+1, end);
    }
  }
}
    
