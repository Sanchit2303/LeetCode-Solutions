class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i=0 ; i<s.length() ; i++){
            int count = 1;
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1 ; j<s.length() ; j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                count++;
            }
            if(max<count){
                max = count;
            }
        }
        return max;
    }
}