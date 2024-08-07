package BitManipulationInJava;

public class BasicBitManipulation {
    public static void main(String[] args) {
        int a=5,b=6;
        System.out.println(a&b);//op : 4 AND operator
        System.out.println(a|b);//op: 7  OR operator
        System.out.println(a^b);//op: 3 XOR operator
        System.out.println(~a);//op: -6 NOT operator shortcut for some question like if a=5 it gives -6 and if a=110 then it gives -111
        System.out.println(a<<b);//left shift
        System.out.println(a>>b);//right shift
        
    }
}
