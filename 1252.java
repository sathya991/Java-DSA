class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ar = new int[m][n];
        int count = 0;
        int len = indices.length;
        for(int i = 0;i<len;i++){
            incrementRow(ar,indices[i][0],n);
            incrementCol(ar,indices[i][1],m);
        }
        for(int[] k: ar){
            for(int l: k){
                if(l%2 != 0){
                    count++;
                }
            }
        }
        return count;
        
    }
    void incrementRow(int[][] ar,int row,int n){
        for(int i =0;i<n;i++){
            ar[row][i]++;
        }
    }
    void incrementCol(int[][] ar,int col,int m){
        for(int i = 0;i < m;i++){
            ar[i][col]++;
        }
    }
}