package Strings;

public class LargestInString {

    public static String findLargestStrign(String str[]){
        String largestString="";
        String stt=str[0];
        for(int i=1;i<str.length;i++){
            if(stt.compareTo(str[i])<0){
                largestString=str[i];
            }
        }
        return largestString;
    }
    public static void main(String[] args) {
        String str[]={"Apple","Banana","Orange","mango"};
        System.out.println(findLargestStrign(str));    
    }
}
