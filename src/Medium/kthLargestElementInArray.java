package Medium;

public class kthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tmp = 0;
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums[nums.length - k];
    }
}
