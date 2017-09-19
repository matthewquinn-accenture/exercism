public class DifferenceOfSquaresCalculator {

    private int result = 0;

    public int computeSquareOfSumTo(int number) {

        for (int i = 1; i <= number; i++) {
            result += i;
        }

        int squareOfSum = (int) Math.pow(result, 2);

        return squareOfSum;
    }

    public int computeSumOfSquaresTo(int number) {
        for (int i = number; 1 <= number; number--) {
            result += (int) Math.pow(number, 2);;
        }

        return result;
    }

    public int computeDifferenceOfSquares(int i) {
        return 0;
    }
}
