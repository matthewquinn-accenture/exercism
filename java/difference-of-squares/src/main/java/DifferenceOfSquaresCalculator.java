public class DifferenceOfSquaresCalculator {

    private int resultSquareOfSum = 0;
    private int resultSumOfSquare = 0;

    public int computeSquareOfSumTo(int number) {

        for (int i = 1; i <= number; i++) {
            resultSquareOfSum += i;
        }

        int squareOfSum = (int) Math.pow(resultSquareOfSum, 2);

        return squareOfSum;
    }

    public int computeSumOfSquaresTo(int number) {

        for (int i = number; 1 <= number; number--) {
            resultSumOfSquare += (int) Math.pow(number, 2);;
        }

        return resultSumOfSquare;
    }

    public int computeDifferenceOfSquares(int number) {

        for (int i = 1; i <= number; i++) {
            resultSquareOfSum += i;
        }

        int squareOfSum = (int) Math.pow(resultSquareOfSum, 2);

        for (int i = number; 1 <= number; number--) {
            resultSumOfSquare += (int) Math.pow(number, 2);;
        }

        return squareOfSum - resultSumOfSquare;
    }
}
