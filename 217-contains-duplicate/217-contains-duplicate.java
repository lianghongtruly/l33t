class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for (int i=0; i<nums.length-1; i++){
        //     for (int j=i+1; j>0; j--){
        //         if (nums[j]<nums[j-1]){
        //             int t = nums[j];
        //             nums[j] = nums[j-1];
        //             nums[j-1] = t;
        //         }
        //         else if(nums[j]==nums[j-1]){
        //             return true;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return false;
        
        HashSet<Integer> numHash = new HashSet<>();
        
        for(int num: nums){
            if(numHash.contains(num))
                return true;
            numHash.add(num);
        }
        return false;

        
        
    }
}