class Solution {
    public int searchInsert(int[] nums, int target) {
        //if(nums.length == 0) return 0;
        
        //check if in array
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i])
                return i;
        }
        
        //if not in array
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > target){
                return i;
            }
        }
        return nums.length;
        
        
    }
}