class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int a=1;
        int b=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)
            {
                arr[n-a] = nums[i];
                a++;
            }
            else
            {
                arr[b] = nums[i];
                b++;
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];  
        }

    }

    /*class Solution {
    static{
        for(int i=0;i<500;i++)
        {
              moveZeroes(new int[]{});
        }
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        int l = nums.length;
        for (int i = 0 ; i < l; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                j++;
            }
            
        }
    }
}*/
}