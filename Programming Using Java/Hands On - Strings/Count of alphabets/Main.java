import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        //Fill the code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isAlphabetic(str.charAt(i))==true)
                count++;
        }
        System.out.println(count);
    }
}
