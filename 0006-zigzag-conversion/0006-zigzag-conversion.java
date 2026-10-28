class Solution {
    public String convert(String s, int rows) {
        if (rows==1|| s.length()<=rows) {
            return s;
        }
        int sections=(s.length()+(2*rows-3))/(2*rows-2);
        int cols=sections*(rows-1);
        int t=0;
        char arr[][]=new char[rows][cols];
        boolean pp=true;
        int i=0;
        int j=0;
        while(t<s.length()){
            if(pp){
                while(i<rows && t<s.length()){
                    arr[i][j]=s.charAt(t++);
                    i++;
                }
                i-=2;
                j++;
                pp=!pp;
            }else{
                while(i>0 && t<s.length()){
                    arr[i][j]=s.charAt(t++);
                    i--;j++;
                }
                pp=!pp;
            }
        }
        StringBuilder ss=new StringBuilder();
        for(int y=0;y<rows;y++){
            for(int z=0;z<cols;z++){
                if(arr[y][z]!='\u0000') {
                    ss.append(arr[y][z]); 
                }
            }
        }
        return ss.toString();
    }
}