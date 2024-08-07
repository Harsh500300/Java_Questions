package Two_DArray;

public class Ques1_How_Many_7 {
    public static void main(String[] args) {
        
    int arr[][]={{4,7,8},{8,8,7}};
    int key=7;
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(key==arr[i][j]){
                count+=1;
            }
        }
    }
    System.out.println("Number of 7 in two dimensional array have :  "+count);
    }
}
