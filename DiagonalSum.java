package Two_DArray;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
          int sum=0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             // For Primary diagonal
    //             if(i==j){
    //                 sum=sum+matrix[i][j];
    //             }
    //             //For secondary diagonal
    //             else if((i+j)==(matrix.length-1)){
    //                 sum+=matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i !=matrix.length-1-i){//
                sum+=matrix[i][matrix.length-1-i]; // i+j=n-1=> j= n-1-j ----->> n =no. of rows
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
}
