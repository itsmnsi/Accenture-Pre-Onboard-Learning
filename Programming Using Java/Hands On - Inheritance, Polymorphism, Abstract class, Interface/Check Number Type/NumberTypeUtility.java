import java.util.*;
public class NumberTypeUtility
{
   public static NumberType isOdd()
   {
       NumberType nt = null;
       nt=(n)->
       {
            if(n%2==0)
                return false;
            else
                return true;
       };
       return nt;
   }
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int num;
       num = sc.nextInt();
       NumberType number = isOdd();
       if(number.checkNumberType(num))
            System.out.println(num+" is odd");
        else
            System.out.println(num+" is not odd");
   }
}
