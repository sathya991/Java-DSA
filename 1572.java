class Solution {
    public int diagonalSum(int[][] mat) {
        int primary = 0;
        int secondary = 0;
        for(int i =0;i < mat.length;i++){
            for(int j = 0; j< mat[0].length;j++){
                if(i == j){
                    primary+=mat[i][j];
                }
                else if((i+j) == mat.length-1){
                    if(i == j){
                        continue;
                    }
                    secondary+=mat[i][j];
                }
            }
        }
        return primary+secondary;
    }
}