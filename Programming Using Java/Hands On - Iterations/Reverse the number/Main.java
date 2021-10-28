import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		int n = sc.nextInt();
		int rev=0, r;
		while(n!=0)
		{
		    r=n%10;
		    rev=rev*10+r;
		    n/=10;
		}
		System.out.println(rev);
	}

}
