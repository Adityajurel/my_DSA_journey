public class StringsRec {
    static  void subSets(String ans,String s,int idx){
        if(idx== s.length()){
            System.out.print(ans+ " ");
            return;
        }
        char ch = s.charAt(idx);
        subSets(ans+ch, s, idx+1);
        subSets(ans, s, idx+1);
    }
    static void pip(int n ){
        if(n==0) return;
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");


    }
    public static void main(String[] args) {
        // String s  = "abc";
        // subSets("", s, 0);
        pip(3 );

    }
}
 