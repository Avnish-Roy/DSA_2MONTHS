package org.example.arrays;

import java.util.Arrays;

public class ProductOfArrExceptIteself {

    public static int[] productExceptSelf(int[] nums) {

        int n=nums.length;
        int[] result=new int[n];

        //prefix  product
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=nums[i-1] * result[i-1];
        }
        //suffix product
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*suffix;
            suffix *=nums[i];
        }

        return result;

    }
    public static void main(String[] args){
        int[] nums=new int[]{ 1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}


