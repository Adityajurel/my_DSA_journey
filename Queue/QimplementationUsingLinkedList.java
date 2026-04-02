
    class Node{
        int val;
        Node next;

        public Node() {
        }
        Node(int val){
            this.val=val;
        }
    }
    class MyQueue{
        Node head;
        Node tail;
        int size;
        void add(int val){
        Node temp =new Node(val);
        if(tail==null) head = tail=temp;
           else{ tail.next=temp;
            tail=temp;
    }
    size++;
}
    void display(){
        Node t= head;
        while(t!=null){
            System.out.print(t.val+" ");
            t = t.next;
        }
        System.out.println();
    }
    int remove(){
        if(head==null){
            tail=null;
            System.out.println("empty h queue");
            return -1;
        }
        int removed = head.val;
        head=head.next;
        size--;
        return removed;
    }
    int peek(){
        if(head==null){
            System.out.println("empty h queue");
            return -1;
        }
        return head.val;
    }
}
public class QimplementationUsingLinkedList {
    public static void main(String[] args) {
        MyQueue q= new MyQueue();
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
