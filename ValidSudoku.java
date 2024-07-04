class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidHorizontalNVertical(board, i))
                return false;
        }

        for (int k = 0; k < 9; k = k + 3) {
            for (int l = 0; l < 9; l = l + 3) {
                if (!squareCheck(board, k, l))
                    return false;
            }
        }
        return true;

    }

    public boolean isValidHorizontalNVertical(char[][] board, int rowOrCol) {
        Set<Character> horCheckSet = new HashSet<>();
        Set<Character> verCheckSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (horCheckSet.contains(board[rowOrCol][i]))
                return false;
            else {
                if (board[rowOrCol][i] != '.')
                    horCheckSet.add(board[rowOrCol][i]);
            }
            if (verCheckSet.contains(board[i][rowOrCol]))
                return false;
            else {
                if (board[i][rowOrCol] != '.')
                    verCheckSet.add(board[i][rowOrCol]);
            }
        }
        return true;
    }

    public boolean squareCheck(char[][] board, int i, int j) {
        int rowMax = i + 3;
        int colMax = j + 3;
        Set<Character> checkSet = new HashSet<>();
        for (int row = i; row < rowMax; row++) {
            for (int col = j; col < colMax; col++) {
                if (checkSet.contains(board[row][col]))
                    return false;
                else {
                    if (board[row][col] != '.')
                        checkSet.add(board[row][col]);
                }
            }
        }
        return true;
    }
}

/*
 * This solution is done in three parts
 * Check the horizontal line first for repetetive elements, do the same for
 * horizontal
 * Then check for each square by jumping 3 in looping.
 */