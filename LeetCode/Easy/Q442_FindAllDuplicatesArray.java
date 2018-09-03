/*Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 * Follow up: try without extra space and in O(n) runtime?
*/

class Q442_FindAllDuplicatesArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int v = Math.abs(nums[i])-1;
            if(nums[v]<0)
                list.add(v+1);
            else
                nums[v]=-nums[v];
        }
        return list;
    }
    
    public List<Integer> findDuplicatesUsingExtraSpace(int[] nums) {
    		boolean[] arr = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
        		if(arr[i-1]!=true)
        			arr[i-1]=true;
             else{
            	 	list.add(i);
             }
         }
         return list;
    }
}