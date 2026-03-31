class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
   
}
class LL{
    Node head;
    Node tail;
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail=temp;
        else{
        tail.next=temp;
        tail= temp;
    }size++;
}
        void display(){
            Node temp = head;
            if(temp== null) return;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();

        }
        void addAtHead(int val){
            Node temp =new Node(val);
            if(head==null) head =tail=temp; 
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void deleteAtHead(){
            if(head==null){
                System.out.println("Bro, LinkedList is already empty.");
                return;
            }
            head = head.next;
            if(head==null) tail=null;
            size--;
        }
    boolean search(int val){
        Node temp = head;
        if(temp==null) return false;
        while(temp!=null){
            if(temp.val==val) return true;
            temp=temp.next;
        }
        return false;
    }
    void insert(int val,int idx){
        if(idx<0||idx>size) {
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp = head;
            for(int i =1;i<idx;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next= t;
            size++;

    }

}
void delete(int idx){
if(idx<0||idx>=size){
    System.out.println("invalid index");
    return;
}
if(idx==0)deleteAtHead();
else{
    Node temp =head;
    for(int i=1;i<idx;i++){
        temp= temp.next;
    }
    temp.next = temp.next.next;
    if(idx==size-1) tail=temp;
    size--;
}
}
int get(int idx){
    if(idx<0||idx>=size) {
        System.out.println("Invalid Index");
        return -1;
    }
Node temp = head;
for(int i =1;i<=idx;i++){
    temp = temp.next;
}
return temp.val;
}
}
public class LLDS {
    public static void main(String[] args) {
        LL l1= new LL();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtHead(5);
        l1.addAtHead(0);
        l1.insert(60,2);
        l1.display();
        l1.delete(5);
        l1.display();
        System.out.println(l1.size);
        System.out.println(l1.get(7));
        // System.out.println(l1.search(5));
    }
}