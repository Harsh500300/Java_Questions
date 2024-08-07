public class pattern8 {
    public static void main(String[] args) {
        int line=10;
        for(int i=line;i>0;i--){
            if(i%2!=0){
                int space=(line-i)/2;
                for(int k=0;k<space;k++){
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
}
