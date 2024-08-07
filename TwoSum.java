public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        int target=9;
        int[] result = twoSum(num, target);
        System.out.println("{"+result[0] + "," + result[1]+"}");
    }
    
} 