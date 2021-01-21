package com.company;

//Given an array of integers, find if the array contains any duplicates.
//
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

import java.util.HashSet;

//Input: [1,2,3,1]
//Output: true
public class Contains_Duplicate {
    public  boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nSet =new HashSet<Integer>();
        for(int i=0 ; i<nums.length ; i++){
            nSet.add(nums[i]);
        }
        return nSet.size()<nums.length;
    }

}
