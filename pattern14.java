public class pattern14 {
    public static void main(String[] args) {
        int n=5;
        char[] ch={'A','B','C','D','E','F'};
        for(int i=0;i<=ch.length;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch[j]);
            }
            System.out.println();
        }
    }
    
}
