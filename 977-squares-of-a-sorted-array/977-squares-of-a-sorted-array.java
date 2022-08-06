class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] squareNums = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     squareNums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(squareNums);
        // return squareNums;
        
        // for(int i = 0; i < nums.length; i++){
        //     nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        
        int i = 0;
        int j = nums.length-1;
        int[] newArr = new int[nums.length];
        
        for(int k = nums.length-1; k >= 0; k--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                newArr[k] = nums[i] * nums[i];
                i++;
            }
            else{
                newArr[k] = nums[j] * nums[j];
                j--;
            }
        }
        return newArr;
        
    }
}