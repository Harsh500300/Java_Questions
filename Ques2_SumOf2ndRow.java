package Two_DArray;

import java.util.Scanner;

public class Ques2_SumOf2ndRow {
    public static void main(String[] args) {
        int sum=0;
        int matrix[][]={ {1,4,9},{11,4,3},{2,2,3} };
        for(int i=(2-1);i<2;i++){
            for(int j=0;j<matrix[0].length;j++){
                sum+=matrix[i][j];
            }
        }
        System.out.println("Sum of all elements in row 2 is : "+sum);
    }
}
