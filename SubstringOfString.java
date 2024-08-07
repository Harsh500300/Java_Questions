package Strings;
import java.util.*;
public class SubstringOfString {
    public static String subString(String str,int si,int ei){
        String subStr="";
        for(int i=si;i<ei;i++){
            subStr +=str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str="Hello String In Java";
        System.out.println("Substring is : "+subString(str, 0, 5));
        // using predefined java function
        //Directttttttttttttttt
        System.out.println("Sub string is : "+str.substring(0,7));
    }
}
