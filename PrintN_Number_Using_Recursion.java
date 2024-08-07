package Recursion;

import java.util.Scanner;

public class PrintN_Number_Using_Recursion {

    public static void main(String[] args) {
        
        System.out.println("Enter input to get output at that number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        printUsingRecursion(0,x);
    }
    
    static void printUsingRecursion(int n,int x){
        if(n==x){
            System.out.println(x);
            return ;
        }
        System.out.println(n);
        printUsingRecursion(n+1,x);
    }
}
