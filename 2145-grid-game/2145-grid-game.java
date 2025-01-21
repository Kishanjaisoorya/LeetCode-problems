class Solution {
    public long gridGame(int[][] grid) {
        long r= 0;
        for(int i: grid[0])
        {
            r+=i;
        }
        long r2 = 0;
        long ms = Long.MAX_VALUE;
        long m = 0;
        for(int i =0;i<grid[0].length;++i)
        {
            r-=grid[0][i];
            m = Math.max(r,r2);
            ms = Math.min(ms,m);
            r2+=grid[1][i];
        }
        return ms;

    }
}