class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] s = new long[n];
        s[0] = nums[0];
        for(int i=1;i<n;i++)
        {
            s[i] = s[i-1] + nums[i];
        }


        int count = 0;
        for(int i=0;i<n-1;i++)
        {
            long l = s[i];
            long r = s[n-1] - s[i];
            if(l >= r)
            {
                count++;
            }
        }
        return count;
}
}