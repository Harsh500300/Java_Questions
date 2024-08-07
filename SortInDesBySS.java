package SortingAss;

public class SortInDesBySS {
    public static void descOrderSortingBySelectionSort(int arr[]){
        //find smallest element in an array and swap it to the minimum position in an array
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,3,2};
        descOrderSortingBySelectionSort(arr);
    }
}
