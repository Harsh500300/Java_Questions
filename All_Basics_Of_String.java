package Strings;

public class All_Basics_Of_String {
    public static void main(String[] args) {
        char ch[]={'a','b','c','d'};
        String str="abcd";
        String str1=new String("xyz");
        int length=str.length();
        System.out.println(length);
        String str2=str+" "+str1;
        System.out.println(str2);
        String str3=str.concat(" "+str1);
        System.out.println(str3);
        System.out.println("Character at index 0 in string str1: "+str1.charAt(0));
        // Basix loop
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
