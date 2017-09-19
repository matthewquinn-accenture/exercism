public class DifferenceOfSquaresCalculator {

    private int result = 0;

    public int computeSquareOfSumTo(int number) {

        for (int i = 1; i <= number; i++) {
            result += i;
        }

        int squareOfSum = (int) Math.pow(result, 2);

        return squareOfSum;
    }

    public int computeSumOfSquaresTo(int i) {
        return 1;
    }

    public int computeDifferenceOfSquares(int i) {
        return 0;
    }
}
