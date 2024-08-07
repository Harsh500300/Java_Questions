public class selecsort {
    public static void sSort(int arr[])
    {
        int n=arr.length;
        int sortArray[]={};
        for(int i=0;i<n-1;){
            for(int j=0;j<n-i-1;i++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            
            sortArray[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(sortArray[i]+"");
        }
    }
    public static void main(String[] args) {
        int num[]={5,4,2,3,1};
        sSort(num);
    }
}
