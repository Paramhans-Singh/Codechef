package Starter92;

import java.util.Scanner;

public class P2 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    
		    if((a==0 && b==0) || (a==0 && c==0) || (b==0 && c==0) || (a==0 && b==0 && c==0)){
		        System.out.println("Water filling time");
		    } 
		    else{
		        System.out.println("Not now");
		    }
		}
	}
} 

