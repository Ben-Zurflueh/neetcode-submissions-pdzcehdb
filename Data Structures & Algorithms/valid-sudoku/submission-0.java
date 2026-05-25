class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] column = new HashSet[9];
        HashSet<Character>[] grid = new HashSet[9];

        for (int i = 0; i < row.length; i++) {
            row[i] = new HashSet<Character>();
        }
        for (int i = 0; i < column.length; i++) {
            column[i] = new HashSet<Character>();
        }
        for (int i = 0; i < grid.length; i++) {
            grid[i] = new HashSet<Character>();
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                if (!row[i].add(board[i][j])) return false;

                if (!column[j].add(board[i][j])) return false;

                if (!grid[(i/3 * 3) + j/3].add(board[i][j])) return false;
            }
        }

        return true;
    }
}
