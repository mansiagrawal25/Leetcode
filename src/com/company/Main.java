package com.company;
import easy.*;
import hard.NumberOfDigitOne;


//
public class Main {

    public static void main(String[] args) {
	// write your code here
//Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,1};
        int k= 11;
        String [] str = {"flower","flee","fish"};
        Contains_Duplicate dup = new Contains_Duplicate();
        System.out.println(dup.containsDuplicate(arr));
        Contains_DuplicateII dup2 = new Contains_DuplicateII();
        System.out.println(dup2.containsNearbyDuplicate(arr,k));
        PowerOfTwo power = new PowerOfTwo();
        System.out.println(power.isPowerOfTwo(k));
        NumberOfDigitOne numbOne= new NumberOfDigitOne();
        System.out.println(numbOne.countDigitOne(k));
        LongestCommonPrefix lcp =new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(str));



    }
}
