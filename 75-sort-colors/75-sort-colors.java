class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        int k = nums.length-1;
        int i = 0;
        int j = 0;
        while(i <= k){
            if(nums[i] == 0){
                swappy(i, j, nums);
                i++;
                j++;
            }
            else if(nums[i] == 1){
                i++;
            }
            else{
                swappy(i, k, nums);
                k--;
            }
        }
        
    }
    public void swappy(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}