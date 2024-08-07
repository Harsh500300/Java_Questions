package Strings;
import java.lang.StringBuilder;
public class CompressionUsingStringBuilder {

    public static String compression(String str){
        StringBuilder compressString=new StringBuilder("");
        String str1="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 &&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            compressString.append(str.charAt(i));
            if(count>1){
                compressString.append(count.toString(count));
            }
            
        }
        str1=compressString.toString();
        return str1;
    }

    public static void main(String[] args) {
        String str="aaabbccdd";
        System.out.println(compression(str));
    }
}
