class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for(int i:nums)
        {
            s.add(i);
        }
        int i = 0; 
        for (int x : s) 
            nums[i++] = x; 
        
        return s.size();

    }
}