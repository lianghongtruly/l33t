class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
//         ArrayList<Integer> result = new ArrayList<>();
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int i = 0;
//         int j = 0;
        
//         while(i < nums1.length && j < nums2.length){
//             if(nums1[i] > nums2[j])
//                 j++;
//             else if(nums1[i] < nums2[j])
//                 i++;
//             else{
//                 result.add(nums1[i]);
//                 i++;
//                 j++;
//             }
//         }
        
//         int[] res = new int[result.size()];
//         for(i = 0; i < result.size(); i++){
//             res[i] = (int) result.get(i);
//         }
        
//         return res;
        
        if(nums1.length > nums2.length)
            return intersect(nums2, nums1);
        
        int[] foreplay = new int[1001];
        for(int n: nums1)
            foreplay[n]++;
        
        int[] answer = new int[nums1.length];
        
        int i = 0;
        
        for(int n: nums2) {
            if(foreplay[n] != 0){
                answer[i++] = n;
                foreplay[n]--;
            }
        }
        return Arrays.copyOf(answer, i);
        
    }
}