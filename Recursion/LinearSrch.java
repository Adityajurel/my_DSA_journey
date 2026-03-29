public class LinearSrch {
    static boolean ls(int []arr,int idx, int x){
        if(idx==arr.length) return false;
        if(arr[idx]== x) return true;
       return ls(arr,idx+1,x);
    }
    static void swap(int []arr,int low ,int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] =temp;
    }
    static void revArr(int []arr,int low,int high){
        if(low>high) return;
        swap(arr,low,high);
        revArr(arr, low+1, high-1);
    }
    
    public static void main(String[] args) {
        int [] arr= {0,12,3,4,43,55,465,54};
        // System.out.println(ls(arr,0,5));
        revArr(arr,0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
