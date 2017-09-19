class RaindropConverter {

    private String rainDrop = "";

    boolean numberHas3PrimeFactor;
    boolean numberHas5PrimeFactor;
    boolean numberHas7PrimeFactor;
    boolean numberHasNoPrimeFactor;

    String convert(int number) {
        numberHas3PrimeFactor = number % 3 == 0;
        numberHas5PrimeFactor = number % 5 == 0;
        numberHas7PrimeFactor = number % 7 == 0;
        numberHasNoPrimeFactor = !numberHas3PrimeFactor && !numberHas5PrimeFactor && !numberHas7PrimeFactor;

        if (numberHas3PrimeFactor) rainDrop = "Pling";

        if (numberHas5PrimeFactor) rainDrop += "Plang";

        if (numberHas7PrimeFactor) rainDrop += "Plong";

        if(numberHasNoPrimeFactor) rainDrop = String.valueOf(number);

        return rainDrop;
    }

}