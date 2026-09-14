class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int check = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 1) {
                count++;
            }
            else {
                if(check < count) {
                    check = count;
                }
                count = 0;
            }
        }

        if(check < count) {
            check = count;
        }

        return check;
    }
}