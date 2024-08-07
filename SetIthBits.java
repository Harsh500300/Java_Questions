package BitManipulationInJava;

public class SetIthBits {

    public static int setithBits(int n,int i){
        int bitMask=1<<i;
        return n | bitMask ;
    }
    public static void main(String[] args) {
        int n=5,i=1;//          5: 00101     , 1: 00010 and n|i==00111   :7
        System.out.println(setithBits(n, i));
    }

    
}
