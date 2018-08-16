/*Given an array, rotate the array to the right by k steps, where k is non-negative.
 * 
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * 
 * Solution 1: (elementPosition+k)%nums.length will be the new position of the element. Use extra array to store the elements with new positions
 * Solution 2: Reverse the array => reverse the first k elements => reverse the remaining elements
 * 
 * @author: pramod
 * */

class Q189_RotateArray {
	
	//First Solution using extra space
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[(i+k)%length] = nums[i];
        }
        for(int i=0;i<length;i++){
            nums[i]=arr[i];
        }
    }
    
    //Second Solution with O(1) space
    public void rotate_again(int[]nums, int k) {
    		int length = nums.length;
		k = k%length;
		reverse(nums,0,length-1);
		reverse(nums,0,k-1);
		reverse(nums,k,length-1);
    }
    
    private void reverse(int[] arr, int start, int end) {
    		while(start<end) {
    			int temp = arr[start];
    			arr[start] = arr[end];
    			arr[end] = temp;
    			start++;
    			end--;
    		}
    }
}