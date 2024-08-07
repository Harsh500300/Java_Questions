package BitManipulationInJava;

public class clearIthBit {
    
    public static int clearBitAtIthIndex(int num,int i){
        int bitMask=~(1<<i);
        return (num & bitMask);
    }

    public static void main(String[] args) {
        int n=10,i=1;
        System.out.println(clearBitAtIthIndex(n, i));
    }

}
