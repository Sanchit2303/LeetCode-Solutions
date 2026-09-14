class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxlen = 0;
        int hash[] = new int[256];
        for(int k=0 ; k<256 ; k++){
            hash[k] = -1;
        }
        while(j<s.length()){
            if(hash[s.charAt(j)]!= -1){
                if(hash[s.charAt(j)] >= i){
                    i = hash[s.charAt(j)]+1;
                }
            }
            int length = j - i + 1;
            if(maxlen<length){
                maxlen = length;
            }
            hash[s.charAt(j)] = j;
            j++;
        }
        return maxlen;
    }
}