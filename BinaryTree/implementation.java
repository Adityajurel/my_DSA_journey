import java.util.*;
class Node{
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val= val;
    }
    
}
class pair{
    Node node;
    int level;
    pair(Node node ,int level){
        this.node=node;
        this.level= level;
    }

}

public class implementation {
    static void display(Node root){
if(root==null) return;
System.out.print(root.val+" ");
display(root.left);
display(root.right);
}
static  int size(Node root){
    if(root==null) return 0;
    return 1+size(root.left)+size(root.right);
}
static int sum(Node root){
    if(root==null) return 0;
    return root.val+sum(root.left)+sum(root.right);
}
static int product(Node root){
if(root==null) return 1;
    return root.val*product(root.left)*product(root.right);
}
static int nonZeroproduct(Node root){
if(root==null) return 1;
int ans=1;
    if(root.val!=0) ans= root.val*nonZeroproduct(root.left)*nonZeroproduct(root.right);
    else {
        nonZeroproduct(root.left);
        nonZeroproduct(root.right);
    }
    return ans;
}
static int max(Node root){
    if(root==null) return Integer.MIN_VALUE;
    return Math.max(root.val, Math.max(max(root.left),max(root.right)));
}
static int level(Node root){
    if(root==null) return 0;
    return 1+Math.max(level(root.left),level(root.right));
}
static  void pre(Node root){
    if(root==null) return;
    System.out.print(root.val+" ");
    pre(root.left);
    pre(root.right);
}  
static void in(Node root){
    if(root==null) return;
    in(root.left);
    System.out.print(root.val+" ");
    in(root.right);
}
static void post(Node root){
    if(root== null) return;
    post(root.left);
    post(root.right);
    System.out.print(root.val+" ");
}
static void levelOrder(Node root){
    Queue <Node> q= new LinkedList<>();
    if(root==null){
        System.out.println("tree is empty");
        return;
    }
    q.add(root);
    while(q.size()>0){
        Node front = q.remove();
    System.out.print(front.val+" ");
    if(front.left!=null)q.add(front.left);
    if(front.right!=null) q.add(front.right);
}
System.out.println();
}
static void levelOrderWise(Node root){
    Queue <pair> q= new LinkedList<>();
    if(root==null){
        System.out.println("tree is empty");
        return;
    }
    int currlevel =0;
    q.add(new pair(root, 0));
    while(q.size()>0){
        pair front = q.remove();
        if(currlevel!=front.level){
            currlevel++;
    System.out.println();
        }
        System.out.print(front.node.val+" ");
    if(front.node.left!=null)q.add(new pair(front.node.left,front.level+1));
    if(front.node.right!=null) q.add(new pair(front.node.right,front.level+1));
   
}
System.out.println();
}
public static void main(String[] args) {
    Node a= new Node(1);
    Node b= new Node(2);
    Node c= new Node(3);
    Node d= new Node(4);
    Node e= new Node(5);
    Node f= new Node(6);
    Node g= new Node(7);
    a.left=b;a.right=c; 
    b.left=d; b.right=e;
    c.left=f; c.right= g;
    // display(a);
    // System.out.println();
    // System.out.println(size(a));
    // System.out.println(sum(a));
    // System.out.println(product(a));
    // System.out.println(nonZeroproduct(a));
    // System.out.println(max(a));
    // System.out.println(level(a));
    // pre(a);
    // System.out.println();
    // in(a);
    // System.out.println();
    // post(a);
    levelOrderWise(a);

     }
   
}
