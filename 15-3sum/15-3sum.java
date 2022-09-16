class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return Collections.emptyList();
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < nums.length - 2; ++i){
            int j = i + 1;
            int k = nums.length - 1;
            
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    //skip duplicates
                    while(j < k && nums[j] == nums[j + 1]) ++j;
                    
                    ++j;
                    --k;
                }else if (sum > 0) {
                    --k;
                } else{
                    ++j;
                }
            }
            //skip duplicates
            while(i < nums.length - 1 && nums[i] == nums[i + 1]) ++i;
        }
        
        return result;
        
    }
}