
import java.util.ArrayList;

public  class JaggedArrays{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        ArrayList <Integer> a=new ArrayList<>();
        a.add(2);a.add(4);a.add(6);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);b.add(5);b.add(7);b.add(9);
        ArrayList <Integer> c = new ArrayList<>();
        c.add(2);c.add(5);

        arr.add(a);arr.add(b);arr.add(c);
        // System.out.println(arr);

        for(int i =0;i<arr.size();i++){
            for(int  j =0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+ "  " );
            }
            System.out.println();
        }
        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);arr.get(arr.size()-1).add(12);
        for(ArrayList<Integer> li:arr){
            for(int i: li){
                System.out.print(i + "  ");
            }
            System.out.println();
        }

    }
}