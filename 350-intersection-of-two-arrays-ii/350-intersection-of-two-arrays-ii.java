class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j])
                j++;
            else if(nums1[i] < nums2[j])
                i++;
            else{
                result.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] res = new int[result.size()];
        for(i = 0; i < result.size(); i++){
            res[i] = (int) result.get(i);
        }
        
        return res;
        
    }
}