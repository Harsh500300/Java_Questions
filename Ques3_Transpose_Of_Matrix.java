package Two_DArray;

public class Ques3_Transpose_Of_Matrix {
    public static void main(String[] args) {
        int matrix[][]={{1,4,9},{11,4,3}};
        int arr[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[j][i]=matrix[i][j];
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
                }
                System.out.println();
        }
    }
}
