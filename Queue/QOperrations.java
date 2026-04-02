import java.util.*;

public class QOperrations {
    static void display(Queue<Integer>q){
        for(int i =0;i<q.size();i++){
            System.out.print(q.peek()+"  ");
            q.add(q.remove());
        }
        System.out.println();
    }
    static void addAtIndex(Queue<Integer> q,int val,int idx){
        if(idx<0||idx>q.size()){
            System.out.println("invalid index");
            return;
        }
        int n = q.size();
        for(int i =0;i<idx;i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i=0;i<n-idx;i++){
            q.add(q.remove());
        }
    }
    static int deleteAtIndex(Queue<Integer>q,int idx){
        if(idx<0||idx>q.size()){
            System.out.println("invalid index");
            return -1;
        }
        for(int i =0;i<idx;i++){
            q.add(q.remove());
        }
        int ans = q.remove();
        for(int i =0;i<q.size()-idx;i++){
            q.add(q.remove());
        }
        return ans;
    }
    static int peekAtIndex(Queue<Integer>q,int idx){
        int ans=-1;
         if(idx<0||idx>q.size()){
            System.out.println("invalid index");
            return -1;
        }
        int n = q.size();
        for(int i =0;i<n;i++){
            if(i==idx) ans = q.peek();
            q.add(q.remove());

        }
      
        return ans;

    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
      addAtIndex(q, 60, 3);
      display(q);
      int del=deleteAtIndex(q, 3);
      System.out.println(del);
      display(q);
      int ans = peekAtIndex(q, 3);
      System.out.println(ans);
    }
}
