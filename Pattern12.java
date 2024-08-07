public class Pattern12 {
    public static void pattern12_1(int n){
        int spaces=2*(n-1);
        for(int i=0;i<n;i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int r=i-1;r>=1;r--){
                System.out.print(r);
            }
            System.out.println();
            spaces-=2;
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern12_1(n);
       
    }
}
