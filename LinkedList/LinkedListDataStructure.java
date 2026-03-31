class Node{
    int val; 
    Node next;
    Node(int val){
        this.val= val;
    }
}
class LL{
    Node head;
    Node tail;
    int size;
    
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null)  head = tail= temp;
        else{   
            tail.next =temp;
            tail=temp;
            
    }
            size++;
}
    void display(){
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head ==null) head = tail = temp;
        else{
            temp.next= head;
            head =temp;
        }
        size++;

    }
    void deleteAtHead(){
        if(head == null) return;
        head=head.next;
        if(head==null) tail=null;
        size--;
        
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.addAtTail(10);
        l1.addAtTail(90);
        l1.addAtTail(100);
        l1.display();
        l1.addAtHead(200);

        l1.display();
        l1.deleteAtHead();
        l1.display();
        System.out.println(l1.size);
    }
}
