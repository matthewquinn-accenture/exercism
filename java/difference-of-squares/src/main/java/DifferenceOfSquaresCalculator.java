public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int number) {
        int result = 0;

        for (int i = 1; i <= number; i++) {
            result += i;
        }

        int squareOfSum = (int) Math.pow(result, 2);

        return squareOfSum;
    }

    public int computeSumOfSquaresTo(int number) {
        int result = 0;

        for (int i = number; 1 <= number; number--) {
            result += (int) Math.pow(number, 2);;
        }

        return result;
    }

    public int computeDifferenceOfSquares(int number) {
        int resultSquareOfSum = 0;
        int resultSumOfSquare = 0;

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
