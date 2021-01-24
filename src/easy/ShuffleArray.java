package easy;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        // Rotate the element to the left
        for (int i = 0, q = 1, k = n; i < n; i++, k++, q++)
            for (int j = k; j > i + q; j--) {
                // swap a[j-1], a[j]
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
            }
        for (int element: nums) {
            System.out.println(element);
        }
        return nums;
}}
