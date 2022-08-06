class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squareNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            squareNums[i] = nums[i] * nums[i];
        }
        Arrays.sort(squareNums);
        return squareNums;
        
    }
}