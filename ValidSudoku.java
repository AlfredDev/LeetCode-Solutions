import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class ValidSudoku
{
    static boolean isValidSudoku(char[][] board) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < board.length; i++){
        }

        return true;
    }

    static boolean ValidHorizontal(char [][] board){
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < 9; i++){
            s.clear();
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                if(s.contains(board[i][j] - 48)) {
                    return false;
                }
                s.add(board[i][j] - 48);
            }

        }
        return true;
    }
}
