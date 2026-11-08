class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;

        for(char ch = 'a'; ch <= 'z'; ch++) {
            int i = word.indexOf(ch);
            int j = word.lastIndexOf(ch);
            int k = word.indexOf(Character.toUpperCase(ch));

            if(i != -1 && k != -1 && j < k) {
                count++;
            }
        }

      
        return count;
    }
}