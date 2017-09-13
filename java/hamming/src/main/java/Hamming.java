public class Hamming {

    String leftStrand;
    String rightStrand;
    int distance = 0;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        boolean leftStrandLengthNotEqualToRightStrandLength = leftStrand.length() != rightStrand.length();

        if(leftStrandLengthNotEqualToRightStrandLength){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        char[] leftStrandChars = leftStrand.toCharArray();
        char[] rightStrandChars = rightStrand.toCharArray();

        for (int strandChar = 0; strandChar < leftStrandChars.length; strandChar++) {
            boolean leftStrandCharNotEqualToRightStrandChar = leftStrandChars[strandChar] != rightStrandChars[strandChar];

            if (leftStrandCharNotEqualToRightStrandChar){
                    distance++;
                }
            }
        return distance;
    }

}
