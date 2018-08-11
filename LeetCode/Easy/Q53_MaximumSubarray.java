/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * NOTE: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * 
 * @author: Pramod
 * */

public class Q53_MaximumSubarray{
	public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEnding = nums[0];
        for(int i=1;i<nums.length;i++){
            maxEnding = Math.max(nums[i],maxEnding+nums[i]);
            maxSoFar=Math.max(maxEnding,maxSoFar);
        }
        return maxSoFar;
    }
}