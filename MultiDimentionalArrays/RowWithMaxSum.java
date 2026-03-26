

public class RowWithMaxSum {
    public static void main(String[] args) {
        int [][]arr = {
        {2,8,3,4,7},
        {7,2,1,6,3},
        {5,5,4,1,4},
        {3,1,8,2,6}
    };
        // for(int i =0;i<arr[0].length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         System.out.print(arr[j][i] + "  ");
        //     }
        //     System.out.println();
        // }
        //  for(int i =0;i<arr.length;i++){
        //     if(i%2==0){
        //          for(int j=0;j<=arr[0].length-1;j++){
        //         System.out.print(arr[i][j] + "  ");
        //     }
        //     }else{
        //     for(int j=arr[0].length-1;j>=0;j--){
        //         System.out.print(arr[i][j] + "  ");
        //     }}
        //     System.out.println();
        // }
          for(int i =0;i<arr[0].length;i++){
            if(i%2==0){
                 for(int j=0;j<=arr.length-1;j++){
                System.out.print(arr[j][i] + "  ");
            }
            }else{
            for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[j][i] + "  ");
            }}
            System.out.println();
        }
        // int sum =0;
        // int maxSum=0;
        // int ans =0;
        // for(int i =0;i<arr.length;i++){
        //     sum=0;
        //     for(int j =0;j<arr[0].length;j++){
        //         sum+= arr[i][j];
        //     }
        //    if(maxSum<sum){
        //     maxSum= sum;
        //     ans =i;
        //    }
        //     }
        //     System.out.println(maxSum);
        //     System.out.println(ans);
        }
    }

