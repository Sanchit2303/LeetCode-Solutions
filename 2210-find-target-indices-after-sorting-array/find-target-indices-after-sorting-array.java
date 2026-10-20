import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target) {
                list.add(i);
            }
            i++;
        }

        return list;
    }
}