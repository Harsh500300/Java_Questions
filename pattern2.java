import java.util.*;
public class pattern2 {
    public static void pattern2(int N) {
        for(int i=0;i<=N;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }    
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        pattern2(N);
    }
}
