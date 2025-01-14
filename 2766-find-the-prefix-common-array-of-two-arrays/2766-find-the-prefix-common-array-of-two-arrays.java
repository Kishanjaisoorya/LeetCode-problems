class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count = 0;
        int n = A.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                for(int k=0;k<i+1;k++)
                {
                    if(A[j]==B[k])
                    {
                        count++;
                    }
                }
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }
    
}