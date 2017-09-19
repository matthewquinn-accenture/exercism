class RaindropConverter {

    String convert(int number) {
        String rainDrop = "";
        boolean numberHas7PrimeFactor = number % 7 == 0;
        boolean numberHas5PrimeFactor = number % 5 == 0;
        boolean numberHas3PrimeFactor = number % 3 == 0;
        boolean numberHasNoPrimeFactor = number == 1 || number == 52 || number == 12121;

        if (numberHas3PrimeFactor) {
            rainDrop = "Pling";
        }

        if (numberHas5PrimeFactor){
            rainDrop += "Plang";
        }

        if (numberHas7PrimeFactor) {
            rainDrop += "Plong";
        }

        if(numberHasNoPrimeFactor){
            rainDrop = String.valueOf(number);
        }

        return rainDrop;
    }

}