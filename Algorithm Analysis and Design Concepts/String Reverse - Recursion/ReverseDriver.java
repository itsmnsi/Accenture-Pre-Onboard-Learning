import java.util.*;
class ReverseDriver
{
  void reverseString(String str)
  {
    if(str==null || str.length()<1)
      System.out.println(str);
    else
    {
      System.out.print(str.charAt(str.length()-1));
      reverseString(str.substring(0,str.length()-1));
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    ReverseDriver obj = new ReverseDriver();
    System.out.print("Reversed string is: ");
    obj.reverseString(str);
  }
}
  
