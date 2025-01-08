class Solution {

    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> s = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!words[i].equals(words[j]) && words[i].contains(words[j]))
                {
                    if(!s.contains(words[j]))
                    {
                    s.add(words[j]);
                    }
                }
            }
        }
        return s;

    }
}