package BitManipulationInJava;

public class GetithBitFromNumber {

    public static int getithBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask) ==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n=10;
        int i=1;
        System.out.println(getithBit(n, i));
    }
    
}
