package Medium;

public class MaxScoreFromPerformingMultiOperations {
    public int maximumScore(int[] nums, int[] multipliers) {
        int score =0;
        int[] copy = nums;
        for(int i=0; i<nums.length-1;i++){
            int len = copy.length-1;
            if(copy[i]*multipliers[i]>copy[len]*multipliers[i]){
                score += copy[i]*multipliers[i];
            }
            else {
                score += copy[len]*multipliers[i];
            }
        }
        return score;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int[] mul ={3,2,1};
        MaxScoreFromPerformingMultiOperations max = new MaxScoreFromPerformingMultiOperations();
        System.out.println(max.maximumScore(nums,mul));
    }
}
