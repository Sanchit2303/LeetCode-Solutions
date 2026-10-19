import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

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