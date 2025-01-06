class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();

        int ans[] = new int[n];

        int bl = 0;
        int br = 0;
        int ml=0;
        int mr=0;

        for(int i =0;i<n;i++)
        {
            ans[i]+=ml;
            bl+= Character.getNumericValue(boxes.charAt(i));
            ml+=bl;

            int j =n-1-i;
            ans[j] += mr;
            br+=Character.getNumericValue(boxes.charAt(j));
            mr+=br;
        }
        return ans;

    }
}