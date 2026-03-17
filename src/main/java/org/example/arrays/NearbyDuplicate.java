package org.example.arrays;

import java.util.HashSet;

public class NearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){

            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        NearbyDuplicate nd = new NearbyDuplicate();
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = nd.containsNearbyDuplicate(nums, k);
        System.out.println("Contains nearby duplicate: " + result);
    }
}
