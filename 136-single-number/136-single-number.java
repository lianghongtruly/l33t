class Solution {
    public int singleNumber(int[] nums) {
//         int n = nums.length;
//         int ans = 0;

//         for(int i = 0; i < n; i++){
//             ans = ans ^ nums[i];
//             // System.out.println(ans);
//         }

//         return ans;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0;i < nums.length;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], 2);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return -1;

    }
}