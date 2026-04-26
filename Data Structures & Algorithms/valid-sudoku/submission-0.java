class Solution {
    public boolean isValidSudoku(char[][] board) {

        int n = board.length;

        for(int boxrow = 0 ; boxrow < 9 ; boxrow+=3){
            for(int boxcol = 0; boxcol < 9 ; boxcol+=3){

                boolean[] seen = new boolean[10];

                for(int i = 0 ; i < 3 ; i++){
                    for(int j = 0 ; j < 3 ; j++){
                        char ch = board[boxrow + i][boxcol + j];
                        if(ch == '.') continue;

                        int num = ch -'0';

                        if(seen[num]) return false;

                        seen[num] = true;
                    }
                }
            }

        }

        for(int i = 0 ; i < n ; i++){
            boolean[] seen = new boolean[10];
            for(int j = 0 ; j < n ; j++){

                char ch = board[i][j];
                if(ch == '.') continue;
                int num = ch -'0';
                if(seen[num]) return false;

                seen[num] = true;
            }
        } 

        for(int i = 0 ; i < n ; i++){
            boolean[] seen = new boolean[10];
            for(int j = 0 ; j < n ; j++){

                char ch = board[j][i];
                if(ch == '.') continue;
                int num = ch -'0';
                if(seen[num]) return false;

                seen[num] = true;
            }
        } 
        

        return true;
        
    }
}
