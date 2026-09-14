class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        int i=0;
        int j=tokens.length-1;
        int maxScore=0;
        Arrays.sort(tokens);
        if(tokens.length==0 || tokens[0]>power){
            return 0;
        }
        while(i<=j){
            if(i<=j&&tokens[i]<=power){
                score++;
                power-=tokens[i];
                i++;
                maxScore=Math.max(maxScore,score);
            }
            else if(i<=j&&tokens[j]>=power){
                score--;
                power+=tokens[j];
                j--;
            }
        }
        return maxScore;
    }
}