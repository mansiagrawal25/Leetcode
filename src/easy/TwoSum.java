package easy;

import Medium.ProductOfArrayExceptSelf;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum= target-nums[i];
            if(map.containsKey(sum)){
                return new int[]{map.get(sum),i};
            }
                map.put(nums[i],i);
        }
        return new int[0];
    }
    public static void  main (String[] args){
        int[] arr={1,2,3,4};
        int target=3;
        TwoSum two= new TwoSum();
        int[] res= two.twoSum(arr,target);
        System.out.println(res[0]+" "+res[1]);


    }


}
