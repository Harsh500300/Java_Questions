public class pattern19 {
    public static void pattern19_1(int n){
        int spaces=0;
        for(int i=0;i<n;i++){
        //stars 
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        for(int k=0;k<spaces;k++)
        {
        System.out.print(" ");
         }
         for(int r=0;r<n-i;r++){
            System.out.print("*");
         }
        System.out.println();
        spaces=spaces+2;
    }
        spaces=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<spaces;k++){
                System.out.print(" ");
            }
            for(int r=1;r<=i;r++){
                System.out.print("*");
            }
            System.out.println();
            spaces-=2;
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern19_1(n);
    }
}
