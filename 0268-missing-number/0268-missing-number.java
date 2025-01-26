class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int r=n;
        for(int i=0 ; i<n ;i++)
        {
            r = r + i - nums[i];
        }
        return r;
    }
}