package com.company;
import Medium.kthLargestElementInArray;
import easy.*;
import hard.NumberOfDigitOne;

import java.util.ArrayList;
import java.util.function.Consumer;


//
public class Main {

    public static void main(String[] args) {
	// write your code here
//Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,1};
        char[] ch = {'h','e','l','l','o'};
        int k= 2;
        int j =31;
        String [] str = {"flower","flee","fish"};
        Contains_Duplicate dup = new Contains_Duplicate();
        System.out.println(dup.containsDuplicate(arr));
        Contains_DuplicateII dup2 = new Contains_DuplicateII();
        System.out.println(dup2.containsNearbyDuplicate(arr,k));
        PowerOfTwo power = new PowerOfTwo();
        System.out.println(power.isPowerOfTwo(k));
        NumberOfDigitOne numbOne= new NumberOfDigitOne();
        System.out.println("Count of Digits is "+numbOne.countDigitOne(j));
        LongestCommonPrefix lcp =new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(str));
        ShuffleArray shuffle = new ShuffleArray();
        System.out.println(shuffle.shuffle(arr,k));
        kthLargestElementInArray kl = new kthLargestElementInArray();
        System.out.println(k+" largest number in array: "+ kl.findKthLargest(arr,k));
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ReverseAString rs = new ReverseAString();
        System.out.println("String: "+ rs.reverseString(ch));
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );




    }
}
