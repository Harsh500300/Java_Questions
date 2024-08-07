public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j = 0; // index for the modified array

        // Iterate through the original array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i]; // Keep non-val elements
                j++; // Increment index for the modified array
            }
        }
        
        return j; // Length of the modified array
    }

    public static void main(String args[]) {
        int nums[] = {3, 2, 2, 3};
        int val = 3;
        int newLength = removeElement(nums, val); // Get the new length after removal
        // Print the modified array elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
