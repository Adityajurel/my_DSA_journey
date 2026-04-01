class Node{
    int val;
    Node next;

    public Node() {
    }
    Node(int val){
        this.val= val;
    }
 
    
}
class myStack{
    Node head;
    int size;
 int peek(){
    return head.val;
 }
 int pop(){
    if(head ==null){
        System.out.println("Stack is empty");
            return -1;
    }
    int x = head.val;
    head = head.next;
    size--;
    return x;
 }
 void push(int val){
Node temp= new Node(val);
if(head==null) head=temp;
else{
temp.next= head;
head = temp;

 }
size++;
}
 void display(){
    Node temp =head;
    if(head==null){
        System.out.println("empty stack");
        return;
    }
    while(temp!=null){
    System.out.print(temp.val+" ");
        temp=temp.next;
 }
 System.out.println();
}
}
public class StackImplementtionUsingLL {
    public static void main(String[] args) {
          myStack l1= new myStack();
          l1.display();
    l1.push(10);
    l1.push(20);
    System.out.println(l1.pop());
    // l1.display();
    // l1.pop();
    // l1.display();
    // System.out.println(l1.size);
    }
  
}
