class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rs = 0;
        int cs = 0;
        int re = grid.length-1;
        int ce = grid[0].length-1;
        if(grid[re][ce] >= 0){
            return 0;
        }
        while(rs<=re && cs <= ce){
            if(grid[rs][ce] >= 0){
                rs++;
            }
            else{
                count+= checkColBefore(grid,rs,ce);
                count+= ((grid.length)-rs);
                ce--;
                rs++;
            }
        }
        return count;
    }
    
    public int checkColBefore(int[][] grid, int row,int col){
        int count = 0;
        while(grid[row][col] < 0){
            if(col-1 >= 0){
                col--;
                if(grid[row][col] < 0){
                    count++;
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }
        return count;
    }
}