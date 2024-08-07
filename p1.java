public class p1 {
        public static int minIncrementForUnique(int[] nums) {
            int count=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[i-1]){
                    count++;
                }
            }
            return count;
        }
        public static void main(String args[]){
            int nums[]={3,2,1,2,1,7};
            System.out.println("Output will be:" +minIncrementForUnique(nums));
        }    
}
