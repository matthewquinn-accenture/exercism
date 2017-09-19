class RaindropConverter {

    String convert(int number) {
        String rainDrop = "";
        boolean numberHas7PrimeFactor = number % 7 == 0;
        boolean numberHas5PrimeFactor = number % 5 == 0;
        boolean numberHas3PrimeFactor = number % 3 == 0;

        if (numberHas7PrimeFactor) {
            rainDrop = "Plong";
        }

        if (numberHas5PrimeFactor){
            rainDrop = "Plang";
        }

        if (numberHas3PrimeFactor) {
            rainDrop = "Pling";
        }

        return rainDrop;
    }

}