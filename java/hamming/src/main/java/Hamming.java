public class Hamming {

    String leftStrand;
    String rightStrand;
    int distance = 0;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        char[] leftStrandChars = leftStrand.toCharArray();
        char[] rightStrandChars = rightStrand.toCharArray();

        for (int i = 0; i < leftStrandChars.length; i++) {
                if (leftStrandChars[i] != rightStrandChars[i]){
                    distance++;
                }
            }
        return distance;
    }

}
