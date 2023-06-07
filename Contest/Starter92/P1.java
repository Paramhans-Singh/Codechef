package Starter92;
import java.util.Scanner;

public class P1 {
    public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if(a+b+(a*b)==111){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
