import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<String, String> dnaStrands = new HashMap();
        dnaStrands.put("G", "C");
        dnaStrands.put("C", "G");

        return dnaStrands.get(dnaStrand);
    }
}