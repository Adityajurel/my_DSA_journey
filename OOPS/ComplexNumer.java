
class Complex{
        int x;
        int y;

    public Complex(int x,int y) {
        this.x=x;
        this.y=y;
    }
        
        void print(){
           if(y>=0) System.out.println(x+"+"+y+"i");
           else System.out.println(x+""+y+"i");
        }
        Complex(){}
        void sum(Complex c){
            x+=c.x;
            y+=c.y;
        }
        void multiply(Complex c){
            x = c.x*x-c.y*y;
            y= x*c.y+y*c.x;
        }
    }

public class ComplexNumer {
   
    public static void main(String[] args) {
        Complex c1= new Complex(5, -1);
        Complex c2 = new Complex(3, 1);
        c1.print();
        c2.print();
        // c1.sum(c2);
        // c1.print();
        // c2.print();
        c1.multiply(c2);
        c1.print();
        c2.print();
    }
}
