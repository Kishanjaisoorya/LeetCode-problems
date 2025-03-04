class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if(n==1){
                return true;
            }
            if(n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
