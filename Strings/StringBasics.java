




public class StringBasics{
    static boolean palindrom(String s){
 int i=0;
    int j = s.length()-1;
    while(i<=j){
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        else {
           return false;
        }
       
    }
     return  true;
    }
    static int  compareTo(String a, String b){
        int min = Math.min(a.length(), b.length());
        for(int i =0;i<min;i++){
            if(a.charAt(i)>b.charAt(i)){
                return (int)(a.charAt(i)-b.charAt(i));
            }
            else if(a.charAt(i)<b.charAt(i)){
                return (int)(-b.charAt(i)+a.charAt(i));
            }
            else{

            }
        }

return (int)(a.length()-b.length());
    }
    static void allSubstr(String s){
        for(int i =0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                System.out.print(s.substring(i, j)+ "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
    //  Scanner sc  = new Scanner(System.in);
    //  String s = sc.nextLine();
//     String a = "dityaaaa";
//     String b="ditya";
//    a+=b;
//    a+=30;
//    a+='z';
//    System.out.println(10+a+20);
//    String s = "pALAK Tyagi";
//    char[] arr =s.toCharArray();
//    for(char ch:arr){
//     System.out.println(ch);
//    } 
String s1= "palak";
String s2 = "dsfuig";

}}