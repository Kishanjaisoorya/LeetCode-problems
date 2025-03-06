class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = 0;
        int du = 0;
        HashMap<Integer,Integer> d = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d.put(grid[i][j], d.getOrDefault(grid[i][j], 0) + 1);
            }
        }
        for(int i=1;i<=n*n;i++)
        {
            if(!d.containsKey(i))
            {
                m=i;
            }
            else if (d.get(i)==2)
            {
                du=i;
            }
        }
        return new int[] {du,m};
    }
}