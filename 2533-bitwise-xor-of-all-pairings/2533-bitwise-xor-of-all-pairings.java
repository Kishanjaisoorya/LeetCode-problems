class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int r = 0;
        int x1 = 0;
        int x2 = 0;

        for(int i:nums1)
        {
            x1^=i;
        }
        for(int i:nums2)
        {
            x2^=i;
        }
        if(nums1.length%2!=0)
        {
            r^=x2;
        }
        if(nums2.length%2!=0)
        {
            r^=x1;
        }
        return r;
    }
}