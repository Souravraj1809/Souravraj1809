class Solution {
    public boolean checkString(String s) {
        Boolean value = true;
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            char bch = s.charAt(i-1);
            if(ch == 'a' && bch == 'b'){
                value = false;
            }
           
        }
     return value;   
    }
}