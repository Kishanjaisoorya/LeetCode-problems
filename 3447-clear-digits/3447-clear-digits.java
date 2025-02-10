class Solution {
    public String clearDigits(String s) {
        int i = 0;
        StringBuilder st = new StringBuilder(s);
        while (i < st.length()) {
            if (Character.isDigit(st.charAt(i))) 
            {
                st.deleteCharAt(i);
                if (i > 0) 
                {
                    st.deleteCharAt(i - 1);
                    i--;
                }
            } 
            else
            {
               i++;
            }
        }
        return st.toString();
    }
}