public class Transpose {
    public static void main(String[] args) {
        int [][]mat = {
            {2,8,3,4},
            {7,2,1,6},
            {5,5,4,1},
            {3,1,8,2}
        };
       
        for(int i=0;i<mat.length;i++){
            for(int j = i+1 ;j<mat.length;j++){
                int temp = mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i]= temp;
        }}

        for(int i=0;i<mat.length;i++){
            for(int j = 0 ;j<mat.length;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
