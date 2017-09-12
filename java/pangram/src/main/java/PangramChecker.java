import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        Set<Character> alphabet = new HashSet<>();

        String lowerCaseInput = input.toLowerCase();
        String noBlanksInput = lowerCaseInput.replaceAll("\\s+", "");
        char[] inputChars = noBlanksInput.toCharArray();

        for (char character : inputChars) {
            if(!Character.isDigit(character)){
                alphabet.add(character);
            }

            if(alphabet.size() == 26){
                return true;
            }
        }
        return false;
    }
}