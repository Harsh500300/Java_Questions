public class RemoveDuplicatesInArray {

    public static int removeDuplicate(int num[]){
        int n=num.length-1;
        int j=0;
        int temp[]=new int[n+1];
        for(int i=0;i<num.length;i++){
            if(i<n && num[i]==num[i+1]){
                continue;
            }
            else{
                num[j]=num[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int num[]={1,1,2,3,4,4};
        System.out.println("The output will be:"+removeDuplicate(num));
    }
}
