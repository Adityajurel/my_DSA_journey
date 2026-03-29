public class NaturalNumber {
    static void printNumber(int n){
        if(n==0) return;
        System.out.print(n+ " ");
        printNumber(n-1);
       if(n!=1) System.out.print(n + " ");
    }
    static void printNaturalRev(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printNaturalRev(n-1);
    }
    static int Fact(int n){
        if(n==0) return 1;
     return  n*Fact(n-1);
    }
    static  int pow(int n,int a){
        if(a==0) return 1;
        return n*pow(n,a-1);
    }
    static int pow2(int n,int a){
if(a==0) return 1;
int call= pow2(n, a/2);
        if(a%2==0)  return  call*call;
        else return n*call*call;
        
    }
    public static void main(String[] args) {
        // printNumber(5);
        // printNaturalRev(5);
        // System.out.println(Fact(1));/
        System.out.println(pow2(2,5));
    }
}
