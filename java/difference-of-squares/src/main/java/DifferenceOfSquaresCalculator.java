public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int number) {
        int numberSum = 0;
        for (int i = 1; i <= number; i++) {
            numberSum += i;
        }
        return squareNumber(numberSum);
    }

    public int computeSumOfSquaresTo(int number) {
        int numberSum = 0;
        for (int i = number; 1 <= number; number--) {
            numberSum += squareNumber(number);
        }
        return numberSum;
    }

    public int computeDifferenceOfSquares(int number) {
        return computeSquareOfSumTo(number) - computeSumOfSquaresTo(number);
    }

    private int squareNumber(int number) {
        return number * number;
    }
}
