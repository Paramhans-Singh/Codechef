import java.util.Scanner;

public class P2 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		while(t-->0){
		    int n =s.nextInt();
		    int x = s.nextInt();
		    int cost = n*x;
		    
		    String str = Integer.toString(cost);
		    int length = str.length();
		    if(length==5 && str.charAt(0)!=0)System.out.println("YES");
		    else System.out.println("NO");
		    
		}
	}
}
