package Starter87;

import java.util.Scanner;

public class P4 {
    public static int countZeroes(int num){
        int count =0;
        while(num>10){
            count++;
            num/=10;
        }
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    long x = s.nextLong();
		    long y = s.nextLong();

            
            if(x*x == 2*y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


		}
	}
}
