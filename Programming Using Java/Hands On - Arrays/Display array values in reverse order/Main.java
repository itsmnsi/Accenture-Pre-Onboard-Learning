
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        
        //Fill the code here
        int n, res, i, j=0;
        System.out.println("Enter the array size \n");
        n = sc.nextInt();
        int array[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter the values");
        for(i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        for(i=n;i>0;i--,j++)
        {
            rev[j] = array[i-1];
            System.out.println(rev[j]);
        }
    }
}
