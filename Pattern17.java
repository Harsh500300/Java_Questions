public class Pattern17 {
    public static void main(String[] args) {
        int n=7;
        char ch[]={'A','B','C','D','E','F','G','H'};
        int space;
        if(n%2==0)
        {
            System.out.println("Error");
        }
        else{
        for(int j=0;j<ch.length;j++){
            if(j%2!=0){
            space=(n-j)/2;
            for(int i=0;i<space;i++){
                System.out.print(" ");
            }
            for(int k=0;k<j;k++){
                System.out.print(ch[k]);
            }
            System.out.println();
            /*
            class main {
   
    static void pattern17(int N)
 {
      
       // Outer loop for the number of rows.
       for(int i=0;i<N;i++){
           
           // for printing the spaces.
           for(int j=0;j<N-i-1;j++){
               System.out.print(" ");
           }
           
           // for printing the characters.
           char ch = 'A';
           int breakpoint = ((2*i)+1)/2;
           for(int j=1;j<=2*i+1;j++){
               
               System.out.print(ch);
               if(j <= breakpoint) ch++;
               else ch--;
           }
           
           // for printing the spaces again.
           for(int j=0;j<N-i-1;j++){
               System.out.print(" ");
           }
           // As soon as the letters for each iteration are printed, we move to the
           // next row and give a line break otherwise all letters
           // would get printed in 1 line.
           System.out.println();
           
       }
 }
 
     public static void main(String[] args) {
         
         // Here, we have taken the value of N as 5.
         // We can also take input from the user.
         int N = 5;
         pattern17(N);
     }
 } 

             */
        }
    }
    }  
}
}
    

