import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Scrabble {

    private String word;

    private Map<List, Integer> scrabbleScoreCard = new LinkedHashMap<>();

    private List<Character> onePointLetters = Arrays.asList('A','E','I','O','U',
            'L','N','R','S','T');
    private List<Character> twoPointLetters = Arrays.asList('D','G');
    private List<Character> threePointLetters = Arrays.asList('B','C','M','P');
    private List<Character> fourPointLetters = Arrays.asList('F','H','V','W','Y');
    private List<Character> fivePointLetters = Arrays.asList('K');
    private List<Character> eightPointLetters = Arrays.asList('J','X');
    private List<Character> tenPointLetters = Arrays.asList('Q','Z');
    private List<Character> lettersToBeScored;

    private char[] lettersPlayed;
    
    private int score = 0;

    Scrabble(String word) {
        this.word = word.toUpperCase();

        scrabbleScoreCard.put(onePointLetters, 1);
        scrabbleScoreCard.put(twoPointLetters, 2);
        scrabbleScoreCard.put(threePointLetters, 3);
        scrabbleScoreCard.put(fourPointLetters, 4);
        scrabbleScoreCard.put(fivePointLetters, 5);
        scrabbleScoreCard.put(eightPointLetters, 8);
        scrabbleScoreCard.put(tenPointLetters, 10);
    }

    int getScore() {
        lettersPlayed = word.toCharArray();

        for (int i = 0; i < lettersPlayed.length; i++) {
            for(Map.Entry<List, Integer> entry : scrabbleScoreCard.entrySet()){
                lettersToBeScored = entry.getKey();
                Integer pointsPerLetter = entry.getValue();
                if(lettersToBeScored.contains(lettersPlayed[i])) {
                    score += pointsPerLetter;
                }
            }
        }
        return score;
    }

}
