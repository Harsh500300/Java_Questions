public class BubbleSort {
    
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){         // turn by which maximum last element we get one or more time and not check 
            for(int i=0;i<arr.length-1-turn;i++){           // again and again for max condition,Here we minus turn 
                if(arr[i]>arr[i+1]){
                int temp=arr[i];            // here , SWAP starts
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }}
        }
    }
    public static void printBS(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int num[]={1,2,4,5,3,8};
        bubbleSort(num);
        printBS(num);
    }
}
