class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;

        while(i < j) {
            int area;

            if(height[i] < height[j]) {
                area = height[i] * (j - i);
                i++;
            }
            else {
                area = height[j] * (j - i);
                j--;
            }

            if(area > max) {
                max = area;
            }
        }

        return max;
    }
}