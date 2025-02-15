class Solution {
    public int punishmentNumber(int n) {
        int sum =0;
        for(int i=1;i<=n;i++){
            int sqr = i*i;
            if(i == 1000 || isPartition(sqr,i)){
                sum += sqr;
                //System.out.println(i+" "+sqr);
            } 
        }
        return sum;
    }
    boolean isPartition(int num, int target){
        char val[] = String.valueOf(num).toCharArray();
        int len = val.length;
        boolean dp[][] = new boolean[len+1][1001];
        dp[0][0] = true;
        for(int i=0; i<len; i++){
            int sum = val[i]-'0';
            populatePossibleSums(sum, dp, i-1, i, target);
            if(i-1 >= 0){
                sum += (val[i-1]-'0')*10;
                populatePossibleSums(sum, dp, i-2, i, target);
            }
            if(i-2 >= 0){
                 sum += (val[i-2]-'0')*100;
                populatePossibleSums(sum, dp, i-3, i, target);
            }
        }
        if(dp[len][target]){
            return true;
        }
        return false;
    }

    void populatePossibleSums(int val, boolean dp[][], int idx, int currIdx, int target){
        for(int i=val; i<=target; i++){
            if(dp[idx+1][i-val]){
                dp[currIdx+1][i] = true;
            }
        }
    }

    //recursive
    boolean isPartition1(int num,int tar){
        if(tar < 0 || num < tar) return false;
        if(num == tar) return true;
        return isPartition(num/10, tar-num%10) || isPartition(num/100, tar-num%100) ||isPartition(num/1000, tar-num%1000);
    }
    
}