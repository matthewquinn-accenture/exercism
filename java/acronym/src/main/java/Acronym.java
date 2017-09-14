import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Acronym {

    private String phrase;
    String acronym = "";

    Acronym(String phrase) {
        this.phrase = phrase.toUpperCase();
    }

    String get() {
        Pattern firstCharOfEachWord = Pattern.compile("\\b[a-zA-Z]");
        Matcher putsCharsToAcronym = firstCharOfEachWord.matcher(phrase);

        while (putsCharsToAcronym.find()) {
            acronym += putsCharsToAcronym.group();
        }
        return acronym;
    }
}