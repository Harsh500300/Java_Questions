package Strings;

public class InternMethodInJava {

    public static void main(String[] args) {
        String str="Java";
        String str1="Java";
        String str2=new String("Java");
        System.out.println(str==str2);
        // So we using intern() -> method to send this str2 data which is in heap memory to constant pool or called stack.
        //so
        String str3=str2.intern();
        System.out.println(str==str3);
        // Now this is the role of Intern method means now str is equals to str3
    }
    
}
