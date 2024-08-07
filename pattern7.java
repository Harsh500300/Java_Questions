public class pattern7 {
    public static void main(String[] args) {
        int line=10; // counts of asterisk  
        for(int i=1;i<line;i++){
            if(i%2!=0){
                int space=(line-i)/2;
                for(int k=0;k<space;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");  
                }
                System.out.println();
            }
        }
    }
    
}
