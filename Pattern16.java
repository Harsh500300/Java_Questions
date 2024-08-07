public class Pattern16 {
    public static void main(String[] args) {
        char ch[]={'A','B','C','D','E','F'};
        for(int i=0;i<ch.length;i++){ 
            for(int j=0;j<i+1;j++){
                System.out.print(ch[i]);
            }
            
            System.out.println();
        }
    }
    
}