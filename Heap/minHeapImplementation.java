class Heap{
int []arr;
int idx=1;
Heap(int capacity){
    arr=new int[capacity+1];
}
void add(int val){
    if(idx==arr.length){
        System.out.println("heap is full");
        return;
    }
    arr[idx++]=val;
    int root=idx-1;
    while(root!=1){
        int p=(root)/2;
        if(arr[root]<arr[p]){
            int temp = arr[p];
            arr[p]=arr[root];
            arr[root]=temp;
            root=p;
        }
        else break;
        
    }
}
int delete(){
    if(idx==1){
         System.out.println("heap is empty");
         return -1;
    }
    int top=arr[1];
    arr[1] = arr[idx-1];
    idx--;
    int root=1;
    while(root<=size()){
        int lc=2*root;int rc=2*root+1;
        int leftval=(lc<=size())?arr[lc]:Integer.MAX_VALUE;
        int rightval=(rc<=size())?arr[rc]:Integer.MAX_VALUE;
        if(arr[root]<leftval&&arr[root]<rightval) break;
        else{
             if(leftval<rightval){
            int temp = arr[root];
            arr[root]=arr[lc];
            arr[lc]=temp;
            root=lc;
             }
             else{
                  int temp = arr[root];
            arr[root]=arr[rc];
            arr[rc]=temp;
            root=rc;
             }

        }
    }

    return top;
}
int peek(){
    if(size()==0) {
        System.out.println("heap is empty");
        return -1;
    }
    return arr[1];
}
int size(){
    return idx-1;
}
void display(){
    for(int i =1;i<=size();i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}
public class minHeapImplementation {
    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.add(10);
        h.add(15);h.add(8);h.add(9);h.add(4);
        h.display();
        h.delete();
        h.display();
    }
}
