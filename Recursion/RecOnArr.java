public class RecOnArr {

    static void printArr(int[]arr,int idx){
        if(idx ==arr.length-1){
            System.out.print(arr[idx] + " ");
            return;
    }
         System.out.print(arr[idx] + " ");
    printArr(arr, idx+1);

}
    public static void main(String[] args) {
        int [] arr ={5,45,35,65,867};
        printArr(arr, 0);

    }
}
