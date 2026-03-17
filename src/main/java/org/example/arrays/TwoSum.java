package org.example.arrays;

import java.util.HashMap;

public class TwoSum {

    //two sums by brute force approach
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null; // Return null if no solution is found
    }
    //by using hash map

    public static int[] twoSumHashMap(int[] nums,int target){
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i=0;i<nums.length;i++)
         {
             int complement=target-nums[i];
             if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
             }
             map.put(nums[i], i);
         }
         return null;
    }
    //two sum by using two pointer approach
    // This approach requires the array to be sorted,
    // so we will sort the array first and
    // then use two pointers to find the target sum.
    // However, since we need to return the original indices
    public static int[] twoSumTwoPointer(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {

                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null; // Return null if no solution is found
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        int[] resultHashMap = twoSumHashMap(nums, target);

        int[]resultTwoPointer=twoSumTwoPointer(nums, target);

//        if (result != null) {
//            System.out.println("Indices: " + result[0] + ", " + result[1]);
//        }
//        if (resultHashMap != null) {
//            System.out.println("Indices: " + resultHashMap[0] + ", " + resultHashMap[1]);
//        }
        if (resultTwoPointer != null) {
            System.out.println("Indices: " + resultTwoPointer[0] + ", " + resultTwoPointer[1]);
        }
        else {
            System.out.println("No two sum solution found.");
        }
    }
}
