/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 *Solution:
*keep a count variable which will increment only when element in the array in not zero
*Once we reach the end of array after first pass, make all the remaining elements as zero.
* Eg: input  => [0,1,0,3,12]
* After first pass => [1,2,12,3,12] & count=3;
* 
*/


class Q283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int num : nums){
            if(num!=0) nums[count++]=num;
        }
        while(count<nums.length)
            nums[count++]=0;
    }
}