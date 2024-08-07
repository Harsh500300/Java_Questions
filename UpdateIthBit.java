package BitManipulationInJava;

public interface UpdateIthBit {
    
    public static int clearBitAtIth(int n,int i){
        int bitMask=~(1<<i);
        return (n & bitMask);
    }

    public static int updateBit(int num,int i,int newBit){
       // for this we directly use this code
       /* 
       if(newBit==0){
            clearBit(n,i);     
       }
        else{
            setIthBit(n,i);    
        }
       */  
        // if(newBit==0){
        // int bitMask=~(1<<i);
        // return (num&bitMask);
        // }
        // else{
        //     int bitMask=1<<i;
        //     return num | bitMask;
        // }
        clearBitAtIth(num, i);
        int bitMask=newBit<<i;
        return num | bitMask;

    }
    public static void main(String[] args) {
        int n=10,i=2,upd=1;
        System.out.println(updateBit(n, i, upd));
    }
}
