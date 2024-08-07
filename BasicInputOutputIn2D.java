package Two_DArray;
import java.util.*;
public class BasicInputOutputIn2D {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Element found in matrix at index "+i+" "+j+" ");
                    return true;
                }
            }
        }
        return false;
    }
    public static void InputOutput(int matrix[][]){
        int m=matrix.length;    //For number of rows 
        int n=matrix[0].length; //For number of columns
        Scanner sc=new Scanner(System.in);
        //2d array --->> row * col so first creates row loop then col loop
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter element in matrix at index "+i+" "+j+" : ");
                matrix[i][j]=sc.nextInt();
            }
        }
        // Print an 2 D array
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        InputOutput(matrix);
        search(matrix, 3);
    }
}
