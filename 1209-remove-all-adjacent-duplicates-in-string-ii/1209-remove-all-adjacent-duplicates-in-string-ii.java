class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.isEmpty() || st.peek()[0]!=c){
                st.push(new int[]{c,1});
                continue;
            }
            else{
                st.peek()[1]++;
                if (st.peek()[1] == k) {
                    st.pop();
                }
            }       
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
           int[] p = st.pop();
            for(int i=0;i<p[1];i++){
                res.append((char)p[0]);
            }
        }
        return res.reverse().toString();
        }



        
    }