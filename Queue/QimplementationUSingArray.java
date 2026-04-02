class CircularQueue{
int[]arr;
int f;
int r;
int size;

    public CircularQueue(int capacity) {
        arr= new int[capacity];
    }
void add(int val){
    if(size==arr.length){
        System.out.println("q is full");
        return;
    }
    if(r==arr.length) r=0;
    arr[r++]=val;
    
    size++;
}
int remove(){
    if(size==0){
        System.out.println("q is empty");
        return -1;
    }
    if(f==arr.length) f=0;
    int removed = arr[f];
    f++;
    size--;
return removed;
}
int peek(){
    return arr[f];
}
void display(){
    if(size==0)return;
    if(f<r){
    for(int i=f;i<r;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
else{
    for(int i =f;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    for(int i =0;i<r;i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println();
}
}
}
public class QimplementationUSingArray {
public static void main(String[] args) {
    CircularQueue q = new CircularQueue(5);
    q.add(10);q.add(20);q.add(30);q.add(40);
    q.display();
    q.remove();
    q.display();
    System.out.println(q.size+ " "+q.peek());
   
}    
}
