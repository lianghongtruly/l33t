class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int right = 0;
        int left = 0;
        int prevSum = 0;
        for(int num: nums)
            total += num;
        
        for(int i = 0; i < nums.length; i++){
            right = total - nums[i] - prevSum;
            left = prevSum;
            prevSum += nums[i];
            
            if(right == left)
                return i;
        }
        
        return -1;
        
    }
}