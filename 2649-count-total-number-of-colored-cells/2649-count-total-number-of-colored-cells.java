class Solution {
    public long coloredCells(int n) {
        long temp = 1;
        
        if (n == 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            temp += ((i) * 4);
        }
        return temp;
    }
}