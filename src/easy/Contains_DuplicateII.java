package easy;

//Given an array of integers and an integer k, find out whether there are two distinct
// indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
//Input: nums = [1,2,3,1], k = 3
//Output: true
public class Contains_DuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        int len = nums.length;
        for(int i =0; i<len; i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j] && ((j+1)-(i+1)<=k)){
                    flag=true;
                }
            }
        }
        return flag;
    }
}
