public class pattern15 {
    public static void main(String[] args) {
        int n=6;
        char[] ch={'A','B','C','D','E','F'};
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(ch[j]);
            }
            System.out.println();
        }
    }
    
}
