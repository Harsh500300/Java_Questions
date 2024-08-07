public class Pattern20 {
    public static void pattern20(int n){
        int spaces=(n*2)-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int k=0;k<spaces;k++){
                System.out.print(" ");
            }
            for(int l=0;l<i;l++){
                System.out.print("*");
            }
            System.out.println();
            spaces-=2;
        }
        spaces=2;
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            for(int k=0;k<spaces;k++){
                System.out.print(" ");
            }
            for(int l=1;l<i;l++){
                System.out.print("*");
            }
            System.out.println();
            spaces+=2;
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern20(n);
    }
}
