import java.util.Stack;

public class PushAtBottom {
    static void pushAtBottom(Stack<Integer> st,int element){
    if(st.size()==0){
        st.push(element);
        return;
    }
   int top= st.pop();
    pushAtBottom(st, element); 
    st.push(top);
}
static  void reverseTheStack(Stack<Integer> st){
    if(st.size()==0){
        return;
    }
    int top = st.pop();
    reverseTheStack(st);
    pushAtBottom(st, top);
}

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        pushAtBottom(st, 50);
        System.out.println(st);
        reverseTheStack(st);
        System.out.println(st);
    }
}
