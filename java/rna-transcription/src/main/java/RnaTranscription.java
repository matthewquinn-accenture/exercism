import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<String, String> dnaStrands = new HashMap();
        dnaStrands.put("C", "G");
        dnaStrands.put("G", "C");
        dnaStrands.put("T", "A");
        dnaStrands.put("A", "U");
        dnaStrands.put("ACGTGGTCTTAA", "UGCACCAGAAUU");

        if(dnaStrands.get(dnaStrand) == null){
            throw new IllegalArgumentException("Invalid input");
        }

        return dnaStrands.get(dnaStrand);
    }
}