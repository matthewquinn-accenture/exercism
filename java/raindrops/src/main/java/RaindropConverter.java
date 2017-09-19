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
        return number % 3 == 0;
    }

    private boolean isNumberAPrimeFactorOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isNumberAPrimeFactorOf7(int number) {
        return number % 7 == 0;
    }

    private boolean isNumberANonPrime(int number) {
        return !isNumberAPrimeFactorOf3(number) && !isNumberAPrimeFactorOf5(number) && !isNumberAPrimeFactorOf7(number);
    }

}
