package Strings;
import java.lang.StringBuilder;

public class CompressString {
    public static String compressStr(String str){
        String compressedString="";
        
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            compressedString+=str.charAt(i);
            if(count>1){
                compressedString += count.toString();
            }
        }
        return compressedString;
    }

    public static void main(String[] args) {
        String str="aabbbbfffddd";
        System.out.println(compressStr(str));
    }
}
