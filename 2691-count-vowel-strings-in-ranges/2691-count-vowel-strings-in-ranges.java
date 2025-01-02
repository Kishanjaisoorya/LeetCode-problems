class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int []ans = new int[queries.length];
        HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a','e','i','o','u')
        );
        int []pre = new int[words.length];
        int sum = 0;
        for(int i=0;i<words.length;i++)
        {
            String curr = words[i];
            if(vowels.contains(curr.charAt(0)) && vowels.contains(curr.charAt(curr.length()-1)))
            {
                sum++;

            }
            pre[i] = sum;
        }

        for(int i=0;i<queries.length;i++)
        {
            int[] curr = queries[i];
            ans[i] = pre[curr[1]] - (curr[0]==0?0: pre[curr[0]-1]);
        }
        return ans;

    }
}