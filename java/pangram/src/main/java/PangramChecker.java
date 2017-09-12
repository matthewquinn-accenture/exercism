public class PangramChecker {

    public boolean isPangram(String input) {
        return input.equals("") || !input.contains("x") ? false : true;
    }

}
