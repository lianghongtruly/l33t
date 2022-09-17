class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int i = 0; i < nums.length; i++){
            switch(nums[i]){
                case 0: red++;
                    break;
                case 1: white++;
                    break;
                case 2: blue++;  
                    break;
            }
        }
        for(int i = 0; i < red; i++) {nums[i] = 0;}
        for(int i = red; i < red+white; i++) {nums[i] = 1;}
        for(int i = white+red; i < white+red+blue; i++) {nums[i] = 2;}
    }
        
//         //Arrays.sort(nums);
//         int k = nums.length-1;
//         int i = 0;
//         int j = 0;
//         while(i <= k){
//             if(nums[i] == 0){
//                 swappy(i, j, nums);
//                 i++;
//                 j++;
//             }
//             else if(nums[i] == 1){
//                 i++;
//             }
//             else{
//                 swappy(i, k, nums);
//                 k--;
//             }
//         }
        
//     }
//     public void swappy(int i, int j, int[] nums){
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
}