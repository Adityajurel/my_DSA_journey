public class SpiralMatrix {
    public static void main(String[] args) {
        int [][]arr= {
            {2,8,3,4},
            {7,2,1,6},
            {5,5,4,1},
            {3,1,8,2}
        };
        int lc=0;int rc=arr[0].length-1;int fr= 0;int lr= arr.length-1;
        
        while(fr<=lr&&lc<=rc){
        for(int i=lc;i<=rc;i++){
            System.out.print(arr[fr][i]+ "  ");

        }
        fr++;
        for(int i=fr;i<=lr;i++){
            System.out.print(arr[i][rc]+ "  ");
          
        }
          rc--;
         for(int i=rc;i>=lc;i--){
            System.out.print(arr[lr][i] +"  ");
       
        }
            lr--;
         for(int i=lr;i>=fr;i--){
            System.out.print(arr[i][lc]+ "  ");
           
        }
        lc++;

    }
        
        

        
    }
}
