class Solution {
    public boolean isValidSudoku(char[][] board) {
        return (checkRows(board) && checkCols(board) && checkBoxes(board));
    }

    public boolean checkRows(char[][] board){
        for(int row = 0; row<9; row++){
            Set<Character> h = new HashSet<>();
            for(int col = 0; col<9; col++){
                if(board[row][col] != '.'){
                    if(h.contains(board[row][col])) return false;
                    h.add(board[row][col]);
                }
            }
        }
        return true;
    }

    public boolean checkCols(char[][] board){
        for(int col = 0; col<9; col++){
            Set<Character> h = new HashSet<>();
            for(int row = 0; row<9; row++){
                if(board[row][col] != '.'){
                    if(h.contains(board[row][col])) return false;
                    h.add(board[row][col]);
                }
            }
        }
        return true;
    }

    public boolean checkBoxes(char[][] board){
        for(int row = 0; row<9; row+=3){
            for(int col = 0; col<9; col+=3){
                
                Set<Character> h = new HashSet<>();
                for(int i=row; i<(row+3);i++){
                    for(int j=col; j<(col+3);j++){
                        if(board[i][j] != '.'){
                            if(h.contains(board[i][j])) return false;
                            h.add(board[i][j]);
                        }

                    }
                }

            }
        }
        return true;



        
    }
}
