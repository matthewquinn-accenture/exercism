class RaindropConverter {

    private String rainDrop = "";

    String convert(int number) {

        if (isNumberAPrimeFactorOf3(number)) rainDrop = "Pling";

        if (isNumberAPrimeFactorOf5(number)) rainDrop += "Plang";

        if (isNumberAPrimeFactorOf7(number)) rainDrop += "Plong";

        if(isNumberANonPrime(number)) rainDrop = String.valueOf(number);

        return rainDrop;
    }

    private boolean isNumberAPrimeFactorOf3(int number) {
        boolean factorOf3 = number % 3 == 0;
        return factorOf3;
    }

    private boolean isNumberAPrimeFactorOf5(int number) {
        boolean factorOf5 = number % 5 == 0;
        return factorOf5;
    }

    private boolean isNumberAPrimeFactorOf7(int number) {
        boolean factorOf7 = number % 7 == 0;
        return factorOf7;
    }

    private boolean isNumberANonPrime(int number) {
        boolean nonFactor = !isNumberAPrimeFactorOf3(number) && !isNumberAPrimeFactorOf5(number) && !isNumberAPrimeFactorOf7(number);
        return nonFactor;
    }

}
