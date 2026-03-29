public class RecOnArr {

    static void printArr(int[]arr,int idx){
        if(idx ==0){
            System.out.print(arr[0]+ " ");
            printArr(arr, arr.length-1);
            System.out.print();
        }
        
    }
    public static void main(String[] args) {
        int [] arr ={5,45,35,65,867};

    }
}
