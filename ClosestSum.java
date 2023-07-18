// Question 1
// Given an integer array nums of length n and an integer target, find three integers
// in nums such that the sum is closest to the target.
// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

// Example 1:
// Input: nums = [-1,2,1,-4], target = 1
// Output: 2

// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

import java.util.Arrays;

public class ClosestSum {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }
    public static int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
        int n=nums.length;
        int sum=nums[0]+nums[1]+nums[n-1];
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int curr_sum=nums[i]+nums[j]+nums[k];
                if(curr_sum<=target){
                    j++;
                }
                else{
                    k--;
                }
                if(Math.abs(sum-target)>Math.abs(curr_sum-target)){
                    sum=curr_sum;
                }
            }
        }
        return sum;
    }
}