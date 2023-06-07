package Starter92;

import java.util.Scanner;

public class P3 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		while(t-->0){
		    int w = s.nextInt();
		    int l = s.nextInt();
		    
		    if(w%2!=0 && l%2!=0){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		}
	}
}
