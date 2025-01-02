class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int result = 0;
        for(int i=0;i<n-1;i++)
        {
            int c = 0;
            for(int j=0;j<=i;j++)
            {
                if(s.charAt(j) == '0')
                {
                    c++;
                }
            }
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(j)=='1')
                {
                    c++;
                }
            }
        
        result = Math.max(result,c);
        }
        return result;
    }
}