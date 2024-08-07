import java.util.*;

public class assignment1_1 {

    public static boolean checktruefalse(int num[]){
       for(int i=0;i<num.length;i++){
        for(int j=i+1;j<num.length;j++){
            if(num[i]==num[j]){
                return true;
            }
        }
       }
       return false;
}
    public static void main(String[] args) {
        int num[]={1,2,3};
        System.out.println(checktruefalse(num));
    }


}