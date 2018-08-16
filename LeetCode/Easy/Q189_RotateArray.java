/*Given an array, rotate the array to the right by k steps, where k is non-negative.
 * 
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * 
 * Explanation: (elementPosition+k)%nums.length will be the new position of the element
 * 
 * @author: pramod
 * */

class Q189_RotateArray {
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
}