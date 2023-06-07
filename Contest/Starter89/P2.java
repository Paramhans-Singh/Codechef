package Starter89;

import java.util.Scanner;

public class P2 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    int p =s.nextInt();
		    int q = s.nextInt();
		    int r = s.nextInt();
		    int sl = s.nextInt();
		    if(p>(q+r+sl)){
		        System.out.println("YES");
		    }
		    else if (q>(p+r+sl)){
		        System.out.println("YES");
		    }
		    else if(r>(p+q+sl)){
		        System.out.println("YES");
		    }
		    else if(sl>(p+q+r)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
