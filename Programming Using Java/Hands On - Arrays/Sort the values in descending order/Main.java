
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        
        //Fill the code here
        int n, temp;
        System.out.print("Enter the array size \n");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.print(a[i] + "\n");
        }
        System.out.print(a[n-1]);
    }
}
