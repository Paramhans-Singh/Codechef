import java.util.Scanner;

public class P3{
    public static boolean helper(int n, int m){
        int difference = n- m;
        return difference % 2 == 0;
    }
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while(t-->0){
    int n = s.nextInt();
    int m = s.nextInt();

    boolean ans = helper(n,m);
    if(ans==true)System.out.println("YES");
    else System.out.println("NO");
    
    }
    }
}

//  diff if alice first then is 2 
//  and if bob first then diff is 4 so we can check by diff%2==0
