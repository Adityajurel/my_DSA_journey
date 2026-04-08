import java.util.*;
public class PriorityQueueSTL {
    public static void main(String[] args) {
        //min heap
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(10);pq.add(20);pq.add(30);pq.add(5);
        System.out.println(pq.peek());
        pq.remove(5);
        System.out.println(pq.peek());
        System.out.println(pq);
        for(int i:pq){
            System.out.print(i+" ");
        }
        System.out.println();
        pq.add(5);pq.add(10);pq.add(15);pq.add(20);pq.add(17);pq.add(12);pq.add(0);
        System.out.println(pq);
        //max heap
        PriorityQueue<Integer> pq1= new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(10);pq1.add(5);pq1.add(15);pq1.add(20);pq1.add(1);
        System.out.print(pq1);
    }

}
