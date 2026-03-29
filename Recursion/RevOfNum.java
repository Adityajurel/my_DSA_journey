public class RevOfNum {
    static int Rev(int num,int a){
        if(num==0) return a;
    
      return   Rev(num/10,a*10+num%10);

    }
    static int Sum(int num){
        if(num==0) return 0;
        return num+Sum(num-1);
    }
    public static void main(String[] args) {
    System.out.println( Sum(10)); 
    }
}
