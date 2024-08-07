public class SelectionSort{
    public static void selectionSort(int num[]){
        for(int i=0;i<num.length;i++){
            int minpos=i;
            for(int j=i+1;j<num.length;j++){
                if(num[j]<num[minpos]){
                    minpos=j;
                }
            }
            //swap
            int temp=num[minpos];
            num[minpos]=num[i];
            num[i]=temp;
        }
    }
    public static void printSSort(int num[]){
        System.out.print("[");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int num[]={6,1,4,2,4,110,33,221,323,222,221};
        selectionSort(num);
        printSSort(num);
    }
}