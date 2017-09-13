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

        for (int i = 0; i < leftStrandChars.length; i++) {
            boolean leftStrandCharNotEqualToRightStrandChar = leftStrandChars[i] != rightStrandChars[i];

            if (leftStrandCharNotEqualToRightStrandChar){
                    distance++;
                }
            }
        return distance;
    }

}
