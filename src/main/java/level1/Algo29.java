package level1;

import java.util.ArrayList;
import java.util.List;

public class Algo29 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < moves.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[j][moves[i]-1] != 0){
                    if (list.isEmpty()){
                        list.add(board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;
                        break;
//                    } else if (list.getLast() == board[j][moves[i]-1]) {
                    } else if (list.get(list.size()-1) == board[j][moves[i]-1]) {
//                        list.removeLast();
                        list.remove(list.size()-1);
                        answer ++;
                        board[j][moves[i]-1] = 0;
                        break;
                    } else {
                        list.add(board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }
            }
        }
        answer *=2;
        return answer;
    }

    public static void main(String[] args) {
        Algo29 algo = new Algo29();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(algo.solution(board,moves)); // result : 4
    }
}
