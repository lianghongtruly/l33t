class Solution {
    public int majorityElement(int[] nums) {
//         HashMap <Integer, Integer> freq = new HashMap<Integer, Integer>();
        
//         for(int i = 0;i < nums.length;i++) {
//             freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
//         }
        
//         for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
//             if(entry.getValue() > nums.length/2) {
//                 return entry.getKey();
//             }
//         }
//         return 0;
        
        int count = 0;
        int ans = 0;
        
        for(int num:nums) {
            if(count == 0) {
                ans = num;
            }
            if(num == ans) {
                count++;
            } else {
                count--;
            }
        }
        
        return ans;
        
    }
}