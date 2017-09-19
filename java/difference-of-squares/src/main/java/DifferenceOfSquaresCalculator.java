public class DifferenceOfSquaresCalculator {


    public int computeSquareOfSumTo(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return (int) Math.pow(sum, 2);
    }

    public int computeSumOfSquaresTo(int i) {
        return 0;
    }

    public int computeDifferenceOfSquares(int i) {
        return 0;
    }
}
