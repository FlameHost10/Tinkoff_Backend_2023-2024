package edu.hw1;

import java.util.ArrayList;
import java.util.Map;

public class Task8 {
    private static int[][] chessboard;
    private static final int[][] impact_options = {
        {2, 1},
        {2, -1},
        {-2, 1},
        {-2, -1},
        {1, 2},
        {-1, 2},
        {1, -2},
        {-1, -2},
    };

    public static boolean knightBoardCapture(int[][] board){
        chessboard = board;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(chessboard[i][j] == 1 && !checking_horse(i, j)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checking_horse(int i, int j){
        for(var elem: impact_options){
            if(checking_coordinates(i + elem[0], j + elem[1]) && chessboard[i + elem[0]][j + elem[1]] == 1){
                return false;
            }

        }
        return true;
    }
    private static boolean checking_coordinates(int i, int j){
        return 0 <= i && i < 8 && 0 <= j && j < 8;
    }



}
