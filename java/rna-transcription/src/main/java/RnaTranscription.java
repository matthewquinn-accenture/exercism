import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    Map<String, String> dnaToRnaTable = new HashMap();

    public RnaTranscription() {
        Map<String, String> dnaToRnaTable = new HashMap<>();

        dnaToRnaTable.put("C", "G");
        dnaToRnaTable.put("G", "C");
        dnaToRnaTable.put("T", "A");
        dnaToRnaTable.put("A", "U");
        dnaToRnaTable.put("ACGTGGTCTTAA", "UGCACCAGAAUU");

        this.dnaToRnaTable = dnaToRnaTable;
    }

    String transcribe(String dnaStrand) {
        String rnaStrand = dnaToRnaTable.get(dnaStrand);
        boolean rnaStrandDoesntExist = (rnaStrand == null);

        if(rnaStrandDoesntExist){
            throw new IllegalArgumentException("Invalid input");
        }
        return rnaStrand;
    }
}