
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the cost of the mobile");
        int c = sc.nextInt();
        if(c<=13000)
        {
            System.out.println("Mobile chosen is within the budget");
        }
        else
        {
            System.out.println("Mobile chosen is beyond the budget");
        }
    }
    
}
