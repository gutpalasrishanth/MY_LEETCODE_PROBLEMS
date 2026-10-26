class Solution {
    public List<String> commonChars(String[] words) {
        int[] count=new int[26];
        Arrays.fill(count, 100);

        for(String word : words){
            int[] freq=new int[26];
            for(char c : word.toCharArray()) {
                freq[c-'a']++;
            }
            for(int i=0;i<26;i++) {
                count[i]=Math.min(count[i],freq[i]);
            }
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(count[i]>0){
                ans.add(String.valueOf((char)(i+'a')));
                count[i]--;
            }
        }
        return ans;
    }
}