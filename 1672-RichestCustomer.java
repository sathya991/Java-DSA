class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = -100;
        for(int row = 0; row< accounts.length;row++){
            int count = 0;
            for(int col = 0; col < accounts[row].length ;col++){
                count += accounts[row][col];
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}