// class Solution {
//     public int maxProduct(String[] words) {
//         int n=0;
//         int max=0;
//         for(int i=0;i<words.length;i++){
//             for(int j=i+1;j<words.length;j++){
//                 String s1=words[i];
//                 String s2=words[j];
//                 int p=0;
//                 while(p<s2.length()&&(!s1.contains(""+s2.charAt(p)))){
//                     p++;
//                 }
//                 if(p>=s2.length()){
//                     max=Math.max(max,s1.length()*s2.length());
//                 }
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int maxProduct(String[] words) {
        int max=0;

        for(int i=0;i<words.length;i++){
            HashSet<Character> set=new HashSet<>();

            for(char c:words[i].toCharArray()){
                set.add(c);
            }

            for(int j=i+1;j<words.length;j++){
                boolean flag=true;

                for(char c:words[j].toCharArray()){
                    if(set.contains(c)){
                        flag=false;
                        break;
                    }
                }

                if(flag){
                    max=Math.max(max,words[i].length()*words[j].length());
                }
            }
        }

        return max;
    }
}