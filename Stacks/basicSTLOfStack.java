import java.util.Stack;

public class basicSTLOfStack {


    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Aditya");
        st.push("annu");
        st.push("ram");
        st.push("klds");
     String s =   st.pop();
        System.out.println(st.peek());
    }
}
