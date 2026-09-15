class Solution {
    public int longestOnes(int[] nums, int k) {
        int r=0 , l=0 , max = 0 , zeros = 0;
        while(r!=nums.length){
            if(nums[r] == 0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            if(zeros<=k){
                int len = r-l+1;
                if(max<len){
                    max = len;
                }
            }
            r++;
        }
        return max;
    }
}