import java.util.Arrays;

class FindMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n=nums1.length;
        int m=nums2.length;
        int k=0;
        int merged[]=new int[n+m];
        for(int i=0;i<n;i++){
            merged[k++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            merged[k++]=nums2[i];
        }
        Arrays.sort(merged);
        if((n+m)%2==0){
            int med1=merged[(n+m)/2-1];
            int med2=merged[(n+m)/2];
            return (((double)med1+(double)med2)/2);
        }
        else{
            return ((merged[(n+m)/2]));
        }
    }
   public static void main(String args[]){
       int nums1[]={1,3};
       int nums2[]={2,3};
       System.out.println(findMedianSortedArrays(nums1,nums2));
   }
    
}