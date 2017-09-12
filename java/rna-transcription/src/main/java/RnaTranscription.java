import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<String, String> dnaStrands = new HashMap();
        dnaStrands.put("C", "G");
        dnaStrands.put("G", "C");
        dnaStrands.put("T", "A");

        return dnaStrands.get(dnaStrand);
    }
}