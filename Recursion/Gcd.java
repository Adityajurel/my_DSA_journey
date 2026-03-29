import java.util.Scanner;

public class Gcd {
    static  int gcd1(int a ,int b){
        int min  = Math.min(a, b);
        int max = Math.max(a, b);
        for(int i=min;i>=1;i--){
            if(max%i==0&&min%i==0) return i;
        }
        return 1;
    }
    static int gcd2(int a, int b){
        if(a==0) return b;
         return gcd2(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st no. :");
        int a  = sc.nextInt();
        System.out.println("enter the 2nd no.:");
        int b = sc.nextInt();
        System.out.println("gcd is =");
        System.out.println(gcd2(a, b));
    }
}
