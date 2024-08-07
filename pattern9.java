public class pattern9 {
    public static void pattern_1st(int n) {
        for(int i=n;i>0;i--){
            if(i%2!=0){
                int space=(n-i)/2;
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
    public static void pattern_2nd(int n){
        for(int i=0;i<n;i++){
            if(i%2!=0){
                int space=(n-i)/2;
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
    public static void main(String[] args) {
        int n=10;
        pattern_1st(n);
        pattern_2nd(n);
    }
    
}
