public class pattern10 {
    public static void pattern10(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*");
        } 
        count++;
        System.out.println();
       // System.out.println(count);
        if(count>=n){
            for(int e=0;e<count-1;e++){
                 for(int o=count-1;o>e;o--){
                    System.out.print("*");
            }
            System.out.println();
        }
        }
    }
       
    }
    public static void main(String[] args) {
        int n=5;
        pattern10(n);
    }
}
