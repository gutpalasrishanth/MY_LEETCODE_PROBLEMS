class Solution {
    public String compressedString(String word) {
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<word.length()){
            int j=i;
            int count=0;
            while(j<word.length()&&word.charAt(i)==word.charAt(j)&&count!=9){
                j++;
                count++;
            }
            sb.append(""+count);
            sb.append(word.charAt(i));
            i=j;
        }
        return sb.toString();
    }
}