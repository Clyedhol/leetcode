package leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BullsandCows {
	public String getHint(String secret, String guess) {
		char[] secretArray = secret.toCharArray();
		char[] guessArray = guess.toCharArray();
		List<Character> secretList = new ArrayList<Character>();
		List<Character> guessList = new ArrayList<Character>();
		for(int i = 0;i<secretArray.length;i++){
			secretList.add(secretArray[i]);
			guessList.add(guessArray[i]);
		}
		int a = 0,b = 0;
		for(int i = 0;i<secretArray.length;i++){
			if(secretArray[i] == guessArray[i]){
				a++;
				secretList.remove((Object)guessArray[i]);
				guessList.remove((Object)guessArray[i]);
			}
		}
		int size = secretList.size();
		for(int i = 0;i<size;i++){
			if(secretList.contains(guessList.get(i))) {
				b++;
				secretList.remove((Object)guessList.get(i));
			}
		}
        return a+"A"+b+"B";
    }
	
	public static void main(String[] args) {
		BullsandCows bc = new BullsandCows();
		System.out.println(bc.getHint("1122", "1221"));
	}
}
