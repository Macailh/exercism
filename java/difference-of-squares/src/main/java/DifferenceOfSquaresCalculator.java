class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int cont = 0;
        for (int i = 1; i <= input; i++) {
            cont += i;
        }
        return cont * cont;
    }

    int computeSumOfSquaresTo(int input) {
        int cont = 0;
        for (int i = 1; i <= input; i++) {
            cont += i * i;
        }
        return cont;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
