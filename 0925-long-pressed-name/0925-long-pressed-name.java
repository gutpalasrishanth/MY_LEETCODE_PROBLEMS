class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length()){
            return false;
        }
        int i=0;
        int j=0;
        while(i<name.length()&&j<typed.length()){
            int c1=0;
            int c2=0;
            while(j+1<typed.length()&&typed.charAt(j)==typed.charAt(j+1)){
                j++;
                c2++;
            }
            while(i+1<name.length()&&name.charAt(i)==name.charAt(i+1)){
                i++;
                c1++;
            }
            if(c2<c1){
                return false;
            }
            if(name.charAt(i)!=typed.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        if(i<name.length()||j<typed.length()){
            return false;
        }else{
            return true;
        }
    }
}