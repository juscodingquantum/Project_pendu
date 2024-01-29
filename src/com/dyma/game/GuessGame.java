package con.dyma.game;

import java.util.ArrayList;
import java.util.List;

public class GuessGame {

    private final List<Character> secretWord = new ArrayList<>();
    private int lifePoints;

    private final List<String> guessWord = new ArrayList<String>();
    public GuessGame(String wordToGuess, int i) {

        for(char c : wordToGuess.toCharArray()){
            this.secretWord.add(c);
        }
        this.lifePoints = lifePoints;
        for (int index = 0; index < this.secretWord.size(); index++) {
            this.guessWord.add("_");
        }

    }

}


