public class diagonal_sum_highly_optimized_code{
        public static void DiagonalSum(int matrix[][]){ // on2
            int sum = 0;
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(i==j){
                        sum +=matrix[i][j];
                    }
                }

                //secondary
                for(int i=0;i<matrix.length;i++){
                    for(int j=0;j<matrix.length;j++){
                        if(i+j == matrix.length-1){
                             sum += matrix[i][j];
                        }
                    }
                }

            for(int i=0; i<matrix.length; i++){
                sum += matrix[i][matrix.length-i-1];
            }
                
                return sum;
            }
            
        }

        public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
                         };
        DiagonalSum(matrix);
    }
}