
public class MergeSort {
static void MSort(int []arr){
    int n = arr.length;
    if(n==1) return;
    int []arr1 = new int[n/2];
    int[] arr2=new int[n-n/2];
    int idx =0;
    for(int i=0;i<arr1.length;i++) arr1[i]= arr[idx++];
    for(int i=0;i<arr2.length;i++) arr2[i]= arr[idx++];
    MSort(arr1);
    MSort(arr2);
    merge(arr1, arr2, arr);
}
    static void merge(int[]a,int []b ,int[]c){
        int i=0;int j =0;int k =0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]) c[k++]= a[i++];
            else c[k++]=b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9};
        MSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
