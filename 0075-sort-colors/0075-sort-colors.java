/*class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
*/
/*class Solution {
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
}*/

class Solution {
    public void sortColors(int[] nums) {
       int low = 0;
       int mid =0;
       int temp = 0;
       int high = nums.length-1;
       while(mid <= high){
         if(nums[mid]==0){
            temp = nums[mid];
            nums[mid] = nums[low];
            nums[low] = temp;
            low++;
            mid++;
         }
         else if(nums[mid]==2){
            temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high--;
         }
         else{
            mid++;
         }
    }
 }
}
