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
        Matcher charOfEachWord = firstCharOfEachWord.matcher(phrase);

        while (charOfEachWord.find()) {
            acronym += charOfEachWord.group();
        }
        return acronym;
    }
}