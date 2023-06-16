class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()<=1){
            return s;
        }
        st.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!st.isEmpty() && st.peek().equals(s.charAt(i))){
                st.pop();
                continue;
            }
            st.add(s.charAt(i));
        }
        String s2="";
        while(!st.isEmpty()){
            s2=st.pop()+s2;
        }
        return s2;
    }
}
