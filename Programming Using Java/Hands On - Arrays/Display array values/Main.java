
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        
        //Fill the code here
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i=0;i<n;i++)
        {
            System.out.println(+ arr[i]);
        }
    }
}
