package Two_DArray;
import java.util.*;
public class StairCaseSearch {

    public static boolean stairCase(int matrix[][],int key){
        int row=0,col=matrix[0].length;
        while(row<matrix.length-2 && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at"+row+" "+col);
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=5,col=4;
        System.out.println("Enter key to search");
        int key=sc.nextInt();
        int matrix[][]=new int[row][col];
        for(int i=0;i<matrix.length;i++){//row 
            for(int j=0;j<matrix[0].length;j++){//column
                System.out.println("enter element in index:"+i+" "+j);
                matrix[i][j] =sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){//row 
            for(int j=0;j<matrix[0].length;j++){//column
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
    }
        stairCase(matrix, key);
    } 
}
