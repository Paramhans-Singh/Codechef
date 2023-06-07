package Starter87;

import java.util.Scanner;

public class P2 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner (System.in);
		int t = s.nextInt();
		while(t-->0){
		    int x = s.nextInt();
		    int y = s.nextInt();
		    
		    int cost = (2*y)+x;
		    System.out.println(cost);
		}
	}
}
