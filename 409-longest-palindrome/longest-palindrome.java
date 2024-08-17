class Solution {
    public int longestPalindrome(String s) {
        int res=0;
        Set<Character> st=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(st.contains(c))
            {
                res+=2;
                st.remove(c);

            }
            else{
                st.add(c);
            }
        }
        return (st.size()>0)?res+1:res;
    }
}