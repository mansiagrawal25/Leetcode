package Medium;

import easy.TwoSum;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right= nums.length-1;
            while(left<right){
                int sum= nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else if(sum>0){
                    right--;
                }
            }
        }
        return list;
    }
    public static void  main (String[] args){
        int[] arr={-1,0,1,2,-1,-4};
        int target=3;
        ThreeSum three = new ThreeSum();
        List<List<Integer>> list= three.threeSum(arr);
        for (List i:list){

              System.out.println(i);

        }




    }
}
