public class Bs2 {
    static void bs(int num[]){
        for(int turn=0;turn<num.length;turn++){
            for(int i=0;i<num.length-1-turn;i++){
                if(num[i+1]<num[i]){
                    //SWAP
                    int temp=num[i];
                    num[i]=num[i+1];
                    num[i+1]=temp;
                }
            }
        }
    }
    static void pbs(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
    public static void main(String[] args) {
        int num[]={1,2,6,3,9,8};
        bs(num);
        pbs(num);
    }
}
