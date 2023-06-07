import java.util.Scanner;

public class P1{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    int n =s.nextInt();
		    int x = s.nextInt();
		    if(n<=x)System.out.println("YES");
		    else System.out.println("NO");
		    }
	}
}