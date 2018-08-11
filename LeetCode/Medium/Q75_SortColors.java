/*
 *Given an array with n objects colored red, white or blue, 
 *sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *Note: You are not suppose to use the library's sort function for this problem.
 *
 *@author: Pramod
 */

public class Q75_SortColors {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int temp=0;
        while(mid<=high){
            if (nums[mid]==0){
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            } else if (nums[mid]==2){
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            } else {
                mid++;
            }
		}
    }
}