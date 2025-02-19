class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n-1;

        while(l<=h)
        {
            int m = (l+h)/2;
            if(target == nums[m])
            {
                return m;
            }
            if(target < nums[m])
            {
                h = m-1;
            }
            else if(target >nums[m])
            {
                
                l = m+1;
            }
        }
        return -1;
        
    }
}