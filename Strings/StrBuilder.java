public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(10);
        System.out.println(s.length()+" "+s.capacity());
     s.append("palak");
     System.out.println(s);  
     System.out.println(s.length()+" "+s.capacity());
        s.setCharAt(0, 'b');
        System.out.println(s);
        String t = s.toString();
        System.out.println(t);
        s.append("lkdghdshblicxjvxcjk");
        System.out.println( s);
             System.out.println(s.length()+" "+s.capacity());
        s.append("sdf");
             System.out.println(s.length()+" "+s.capacity());
        s.delete(5,s.length());
        System.out.println(s);
        // s.delete(0,1);
        System.out.println(s.reverse());
    }
}
