package BitManipulationInJava;
import java.util.*;
public class OddOrEvenByBits {
    public static void main(String[] args) {
        int bitMask=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :   ");
        int num=sc.nextInt();
        if((num&bitMask) ==bitMask){
            System.out.println("Odd Number: " + num);
        }
        else{
            System.out.println("Even number: " + num);
        }
    }
    
}
