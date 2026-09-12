class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i=1;
        int j=0;
        StringBuilder ss=new StringBuilder("");
        ss.append(w1.charAt(0));
        while(i<w1.length()&&j<w2.length()){
            if(i>j){
                ss.append(w2.charAt(j));
                j++;
            }else{
                ss.append(w1.charAt(i));
                i++;
            }
        }
        while(i<w1.length()){
            ss.append(w1.charAt(i));
            i++;
        }
        while(j<w2.length()){
            ss.append(w2.charAt(j));
            j++;
        }
        return ss.toString();
    }
}