class ListNode{
int val;
ListNode prev;
ListNode next;

ListNode() {
    }
ListNode(int val){
    this.val=val;
}
}
class DLL{
ListNode head;
ListNode tail;
int size;
void InsertAtHead(int val){
    ListNode temp = new ListNode(val);
    if(head ==null) head =tail =temp;
    else{
        temp.next=head;
        head.prev=temp;
        head= temp;
    }
    size++;
}
void Display(){
    if(head==null){
        System.out.println("ll is empty");
        return;
    }
    ListNode temp = head;
    while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
    }
    System.out.println();
}
void insertAtTail(int val){
    ListNode temp = new ListNode(val);
    if(head==null) head = tail = temp;
    else{
        temp.prev= tail;
        tail.next = temp;
        tail=temp;
    }
    size++;
}
void deleteAtHead(){
      if(size==1){
        head=tail=null;
        size--;
        return;
    }
    if(head==null){
        System.out.println("empty ll");
        return;
    }else{
        head=head.next;
        head.prev=null;
    }
    size--;
}
void deleteAtTail(){
    if(size==1){
        head=tail=null;
        size--;
        return;
    }
    if(tail==null){
        System.out.println("empty ll");
        return;
    }else{
        tail=tail.prev;
        tail.next =null;
    }
    size--;
}
void DisplayRev(){
    ListNode temp =tail;
    while(temp!=null){
        System.out.print(temp.val+" ");
        temp =temp.prev;
    }
    System.out.println();
}
void insert(int val,int index){
    if(index<0||index>size){
        System.out.println("invalid index");
        return;
    }
    if(index==0){
         InsertAtHead(val);
         return;
    }
    if(index==size){
        insertAtTail(val);
        return;
    }
    ListNode temp = new ListNode(val);
    ListNode t1 =head;
    for(int i=1;i<index;i++){
        t1=t1.next;
    }
    ListNode b=t1.next;
    t1.next=temp;
    temp.prev=t1;
    temp.next = b;
    b.prev=temp;
    size++;
}
void deleteAtIndex(int index){
     if(index<0||index>size){
        System.out.println("invalid index");
        return;
    }
    if(index==0){
         deleteAtHead();
         return;
    }
    if(index==size){
       deleteAtTail();
        return;
    }
    ListNode t1 = head;
    for(int i =1;i<index;i++){
        t1=t1.next;
    }
    ListNode b= t1.next.next;
    t1.next=b;
    b.prev =t1;
    size--;

}
}
public class DoublyLinkedList {

public static void main(String[] args) {
    DLL list = new DLL();
    // list.Display();
    list.InsertAtHead(20);
    list.insertAtTail(30);
    list.insertAtTail(40);
    // list.deleteAtHead();
    // list.deleteAtTail();
    // list.deleteAtHead();
    list.insert(5, 3);
    list.deleteAtIndex(2);
    list.Display();
    list.DisplayRev();

    System.out.println(list.size);


}
}