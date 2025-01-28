/*class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
*/
class Solution {
    public void sortColors(int[] nums) {
        int[] c = new int[3];

        for (int n : nums) {
            c[n]++;
        }
        int l = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < c[i]; j++) {
                nums[l] = i;
                l++;
            }
        }

    }
}
