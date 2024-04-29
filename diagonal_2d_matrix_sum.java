public class diagonal_2d_matrix_sum{
    public static int diagonalSum(int matrix[][]){
         int sum =0;
         for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if( i == j){
                    sum += matrix[0].length;
                     
                }

                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
         }
         return sum;
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
                         };
        diagonalSum(matrix);
    }
}