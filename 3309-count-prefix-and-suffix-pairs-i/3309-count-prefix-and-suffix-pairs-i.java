class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count =0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(isPrefixAndSuffix(words[i] , words[j]))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPrefixAndSuffix(String st1,String st2)
    {
        return st2.startsWith(st1) && st2.endsWith(st1);
    }
}