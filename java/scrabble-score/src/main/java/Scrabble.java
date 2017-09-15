import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private Map<String, Integer> scrabbleScoreCard = new HashMap<>();
    char[] onePointLetters = {'A','E','I','O','U',
            'L','N','R','S','T'};
    char[] twoPointLetters = {'D','G'};
    char[] threePointLetters = {'B','C','M','P'};
    char[] fourPointLetters = {'F','H','V','W','Y'};
    char[] fivePointLetters = {'K'};
    char[] eightPointLetters = {'J','X'};
    char[] tenPointLetters = {'Q','Z'};

    public Scrabble(Map<char[], Integer> scrabbleScoreCard) {
        scrabbleScoreCard.put(onePointLetters, 1);
        scrabbleScoreCard.put(twoPointLetters, 2);
        scrabbleScoreCard.put(threePointLetters, 3);
        scrabbleScoreCard.put(fourPointLetters, 4);
        scrabbleScoreCard.put(fivePointLetters, 5);
        scrabbleScoreCard.put(eightPointLetters, 8);
        scrabbleScoreCard.put(tenPointLetters, 10);
    }

    Scrabble(String word) {
        String upperCaseWord = word.toUpperCase();
    }

    int getScore() {
        return 0;
    }

}
