package com.wuji;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/
 *
 *Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

 The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * Created by yangzhou on 15/11/5.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Integer>> rowSetList = new ArrayList<>();
        List<Set<Integer>> columnSetList = new ArrayList<>();
        List<Set<Integer>> blockSetList = new ArrayList<>();
        int l = board.length;
        for (int i = 0; i < l; i++) {
            rowSetList.add(new HashSet<>());
            columnSetList.add(new HashSet<>());
            blockSetList.add(new HashSet<>());
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (board[i][j] == '.')continue;
                if (board[i][j] > '9' || board[i][j] <'1') return false;
                if (rowSetList.get(i).contains(board[i][j] -'0')) return false;
                else rowSetList.get(i).add(board[i][j] -'0');
                if (columnSetList.get(j).contains(board[i][j] -'0')) return false;
                else columnSetList.get(j).add(board[i][j] -'0');
                if (blockSetList.get(i/3+ (j/3)*3).contains(board[i][j] - '0')) return false;
                else blockSetList.get(i/3+ (j/3)*3).add(board[i][j] -'0');

            }
        }
        return true;
    }
}
