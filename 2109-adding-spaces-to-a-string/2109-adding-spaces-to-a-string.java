class Solution {
    public String addSpaces(String s, int[] sp) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<s.length()&&j<sp.length){
            if(i==sp[j]){
                sb.append(" "+s.charAt(i));
                i++;j++;
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        while(i<s.length()){
            sb.append(s.charAt(i++));
        }
        return sb.toString();
    }
}