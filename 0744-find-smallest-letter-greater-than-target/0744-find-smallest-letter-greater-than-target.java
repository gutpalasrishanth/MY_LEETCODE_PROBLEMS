class Solution {
    public char nextGreatestLetter(char[] l, char tar) {
        for(char c:l){
            if(c>tar){
                return c;
            }
        }
        return l[0];
    }
}