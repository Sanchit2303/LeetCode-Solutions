class Solution {
    public int lengthOfLastWord(String s) {

        s += " ";

        int r = 0;
        int l = 0;
        int len = 0;

        while (r < s.length()) {

            if (s.charAt(r) == ' ') {

                if (r > l) {
                    len = r - l;
                }

                l = r + 1;
            }

            r++;
        }

        return len;
    }
}