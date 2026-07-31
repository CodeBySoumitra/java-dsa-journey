class Solution {
    public int singleNumber(int[] nums) {
        int i = nums.length;
        int ans = 0;
        for(int num : nums){
            ans = ans ^ num;
        }
        return ans;
    }
}
