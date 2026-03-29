public class TowerOfHanoi {
    static  void hanoi(int n,char src,char helper,char dest){
        if(n==0) return;
        hanoi(n-1, src, dest, helper);   //n-1 disk from a to b via c
        System.out.println(src+"->"+dest);           //nth disk a to c
        hanoi(n-1, helper, src, dest);  // n-1 disk from b to c via a
    }
    public static void main(String[] args) {

        hanoi(3,'A','B','C');
    }
}
