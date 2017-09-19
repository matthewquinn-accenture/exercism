class RaindropConverter {

    private String rainDrop = "";

    String convert(int number) {
        boolean numberHas3PrimeFactor = number % 3 == 0;
        boolean numberHas5PrimeFactor = number % 5 == 0;
        boolean numberHas7PrimeFactor = number % 7 == 0;
        boolean numberHasNoPrimeFactor = !numberHas3PrimeFactor && !numberHas5PrimeFactor && !numberHas7PrimeFactor;

        if (numberHas3PrimeFactor) rainDrop = "Pling";

        if (numberHas5PrimeFactor) rainDrop += "Plang";

        if (numberHas7PrimeFactor) rainDrop += "Plong";

        if(numberHasNoPrimeFactor) rainDrop = String.valueOf(number);

        return rainDrop;
    }

}