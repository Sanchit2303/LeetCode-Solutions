class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i=-1 ,j=cardPoints.length-1;
        int maxsum = 0 , sum = 0;
        for(int p=0 ; p<k ; p++){
            sum+=cardPoints[p];
            i++;
        }
        maxsum = sum;
        while(i!=(-1)){
            sum = sum - cardPoints[i];
            sum = sum + cardPoints[j];
            i--;j--;
            if(maxsum<sum){
                maxsum = sum;
            }
        }
        return maxsum;
    }
}