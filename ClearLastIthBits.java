package BitManipulationInJava;

public class ClearLastIthBits {

    public static int clearLastIthBits(int n,int i){   
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n=15,i=2;
        System.out.println(clearLastIthBits(n, i));
    }
    
}
