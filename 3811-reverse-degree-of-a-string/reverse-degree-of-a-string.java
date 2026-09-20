class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0 ; i<s.length() ; i++){
            int pro = (i+1)*('z'-s.charAt(i)+1);
            sum+=pro;
        }
        return sum;
    }
}