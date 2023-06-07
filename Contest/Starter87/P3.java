package Starter87;

import java.util.Scanner;

public class P3 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner (System.in);
		int t = s.nextInt();
		
		while(t-->0){
		    int x = s.nextInt();
		    int cost = x;
		    int rem = x%10;
		    
		    if(rem>=5){
		       int less = 10-rem;
		       cost = x+less;
		    }
            else{
                cost = x-rem;
            }
		    
		    System.out.println(100-cost);
		}
	}
}
