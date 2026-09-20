class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int indx1 = 0;
        int indx2 = 0;
        int len = nums1.length + nums2.length;

        int arr[] = new int[len];

        for(int i = 0; i < len; i++) {

            if(indx1 == nums1.length) {
                arr[i] = nums2[indx2];
                indx2++;
            }
            else if(indx2 == nums2.length) {
                arr[i] = nums1[indx1];
                indx1++;
            }
            else if(nums1[indx1] < nums2[indx2]) {
                arr[i] = nums1[indx1];
                indx1++;
            }
            else {
                arr[i] = nums2[indx2];
                indx2++;
            }
        }

        if(len % 2 != 0) {
            return arr[len / 2];
        }
        else {
            return (arr[(len / 2) - 1] + arr[len / 2]) / 2.0;
        }
    }
}