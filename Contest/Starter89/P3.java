package Starter89;

import java.util.Scanner;

public class P3 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner (System.in);
		int t = s.nextInt();
		while(t-->0){
		    String str = s.next();
		    int day = Integer.parseInt(str.split("/")[0]);
		    int month = Integer.parseInt(str.split("/")[1]);
		    if(day>12 && month<=12){
		        System.out.println("DD/MM/YYYY");
		    }
		    else if(day<=12 && month>12){
		        System.out.println("MM/DD/YYYY");
		    }
		    else{
		        System.out.println("BOTH");
		    }
		}
	}
}
