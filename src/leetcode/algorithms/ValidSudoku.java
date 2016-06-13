package leetcode.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		for(int i = 0;i<9;i++){
			if(isValidNine(board[i]));
			else return false;
		}
		char[] temp4column = new char[9];
		for(int i = 0;i<9;i++){
			for(int j = 0;j<9;j++)
				temp4column[j] = board[j][i];
			if(isValidNine(temp4column));
			else return false;
		}
		for(int i = 0;i < 9;i = i+3){
			for(int j = 0;j < 9;j = j+3){
				getArray(temp4column,board,i,j);
				if(isValidNine(temp4column));
				else return false;
			}
		}
        return true;
    }
	
	public boolean isValidNine(char[] nine){
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 1;i<10;i++){
			map.put(i+"", 0);
		}
		map.put(".", 0);
		for(int i = 0;i<9;i++){
			if(!(nine[i]+"").equals(".")){
				int temp = map.get(nine[i]+"") + 1;
				if(temp > 1) return false;
				map.put(nine[i]+"", temp);
			}
		}
		return true;
	}
	
	public void getArray(char[] temp4column,char[][] board,int i,int j){
		int m = 3,k = 0;
		while(m != 0){
			int n = 3;
			while(n != 0){
				temp4column[k] = board[i][j];
				i++;
				n--;
				k++;
			}
			j++;
			m--;
		}
	}
	
	public static void main(String[] args) {
		ValidSudoku vs = new ValidSudoku();
		char[] board = {'.','5','.','3','.','.','.','.','3'};
		System.out.println(vs.isValidNine(board));
	}
	
	public boolean bestSolution(char[][] board){
        Set<Character>[] setXX = new HashSet[9];
        Set<Character>[] setYY = new HashSet[9];
        Set<Character>[] setXY = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            setXX[i] = new HashSet<>();
            setYY[i] = new HashSet<>();
            setXY[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if(!setXX[i].add(board[i][j])){
                    return false;
                }
                if(!setYY[j].add(board[i][j])){
                    return false;
                }
                if(!setXY[(j / 3)* 3 + i / 3].add(board[i][j])){
                    return false;
                }
            }
        }
        return true;
	}
}
