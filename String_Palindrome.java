package Strings;

public class String_Palindrome {
    public static void main(String[] args) {
        String str="racecar";
        char ch;
        String revStr="";
        for(int i=0;i<=str.length()-1;i++){
            ch=str.charAt(i);
            revStr+=ch;
        }
        System.out.println(revStr);
        if(str.equals(revStr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
