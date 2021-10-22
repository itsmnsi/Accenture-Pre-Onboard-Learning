import java.util.*;
class MergeSortDriver
{
  public static void merge(int arr[], int l, int m, int r)
  {
    int n1 = m-l+1;
    int n2 = r-m;
    int L[] = new int[n1];
    int R[] = new int[n2];
    for(int i=0;i<n1;++i)
      L[i] = arr[l+i];
    for(int j=0;j<n2;++j)
      R[j] = arr[m+1+j];
    int i=0, j=0;
    int k=l;
    while(i<n1 && j<n2)
    {
      if(L[i]<=R[j])
      {
        arr[k]=L[i];
        i++;
      }
      else
      {
        arr[k] = R[j];
        j++;
      }
      k++;
    }
    while(i<n1)
    {
      arr[k] = L[i];
      j++;
      k++;
    }
    while(j<n2)
    {
      arr[k] = R[j];
      j++;
      k++;
    }
  }
  public static void mergeSort(int arr[], int l, int r)
  {
    if(l<r)
    {
      int m = (l+r)/2;
      mergeSort(arr, l, m);
      mergeSort(arr, m+1, r);
      merge(arr, l, m, r);
    }
  }
  public static void printArray(int arr[])
  {
    int n = arr.length;
    for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
    System.out.println();
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of an array:");
    int n = sc.nextInt();
    if(n>0)
    {
      int arr[] = new int[n];
      System.out.print("Enter the elements:");
      for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
      System.out.println("Given array is");
      printArray(arr);
      mergeSort(arr, 0, arr.length-1);
      System.out.println("\nSorted array is");
      printArray(arr);
    }
    else
    {
      System.out.println("Invalid array size");
    }
  }
}
      
        
          
