package Starter87;

import java.util.Scanner;

public class P1 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner (System.in);
		int t = s.nextInt();
		while(t-->0){
		    int x = s.nextInt();
		    
		    int cost = 4*x;
		    
		    if(cost<=1000){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	    
	}
}
