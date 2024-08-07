package SortingAss;

public class SortInDesByBS {
    public static void descOrderSortingByBubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int turn=i;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //print bubble sort
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,3,2,8,1};
        descOrderSortingByBubbleSort(arr);
    }
}
