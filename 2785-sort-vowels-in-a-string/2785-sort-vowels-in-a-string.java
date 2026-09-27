class Solution {
    public String sortVowels(String s) {
        String str="AEIOUaeiou";
        char chrs[]=s.toCharArray();
        ArrayList<Character> arr=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(str.indexOf(ch)!=-1){
                arr.add(ch);
            }
        }
        Collections.sort(arr);
        int k=0;
        for(int i=0;i<chrs.length;i++){
            if(str.indexOf(chrs[i])!=-1){
                chrs[i]=arr.get(k);
                k++;
            }

        }
        return new String(chrs);
    }
}