import java.util.Scanner;
class SortDriver
{
  public final static int MAX = 100;
  public static String alternateSort(String str)
  {
    int n  = str.length();
    char s[] = str.toCharArray();
    int lcount[] = new int[MAX];
    int ucount[] = new int[MAX];
    for(int i=0;i<n;i++)
    {
      if(character.isUpperCase(s[i]))
        ucount[s[i] - 'A']++;
      else
        lcount[s[i] - 'a']++;
    }
    int i=0,j=0,k=0;
    while(k<n)
    {
      while(i<MAX && ucount[i]==0)
      i++;
      if(i<MAX)
      {
        s[k++] = (char)('A'+i);
        ucount[i]--;
      }
      while(j<MAX && lcount[j]==0)
      j++;
      if(j<MAX)
      {
        s[k++] = (char)('a'+j);
        lcount[j]--;
      }
    }
    return(new String(s));
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    String ans = alternateSort(str);
    System.out.print("The Sorted String is: "+ans);
  }
}
  
      
